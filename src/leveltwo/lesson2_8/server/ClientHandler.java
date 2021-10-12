package leveltwo.lesson2_8.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientHandler {

    private Server server;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private String name;
    private boolean isAuthentificated;


    public ClientHandler(Server server, Socket socket) {

        try {
            this.server = server;
            this.socket = socket;
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            CreateExecutorService();
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong during client establishing...", e);
        }

    }

    private void CreateExecutorService() {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(new Thread(() -> {
            try {
                doAuthentication();
                listenMessages();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                closeConnection(socket);
            }
        }));

        executor.shutdown();
    }

    private void closeConnection(Socket socket) {
        server.unsubscribe(this);
        server.broadcastMessage(String.format("User[%s] is out.", name));

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    private void doAuthentication() throws IOException {
        sendMessage("Greeting you in the Outstanding Chat.");
        sendMessage("Please do authentication. Template is: -auth [login] [password]");

        while (true) {
            String maybeCredentials = in.readUTF();
            /** sample: -auth login1 password1 */
            if (maybeCredentials.startsWith("-auth")) {
                String[] credentials = maybeCredentials.split("\\s");

                Optional<AuthService.Entry> maybeUser = server.getAuthService()
                        .findUserByLoginAndPassword(credentials[1], credentials[2]);

                if (maybeUser.isPresent()) {
                    AuthService.Entry user = maybeUser.get();
                    if (server.isNotUserOccupied(user.getName())) {
                        name = user.getName();
                        sendMessage("AUTH OK.");
                        sendMessage("Welcome.");
                        server.broadcastMessage(String.format("User[%s] entered chat.", name));
                        server.subscribe(this);
                        return;
                    } else {
                        sendMessage("Current user is already logged in");
                    }
                } else {
                    sendMessage("Invalid credentials.");
                }
            } else {
                sendMessage("Invalid auth operation");
            }
        }
    }

    public void sendMessage(String outboundMessage) {
        try {
            out.writeUTF(outboundMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listenMessages() throws IOException {
        while (true) {
            String inboundMessage = in.readUTF();
            if (inboundMessage.equals("-exit")) {
                break;
            }
            server.broadcastMessage(inboundMessage);
        }
    }

    public void terminatingIfNoAuthentication(Socket socket) {
        TimerTask terminateConnection = new TimerTask() {
            @Override
            public void run() {
                sendMessage("You didn't authorise in 120 sec.\n Your connection is interrupted");
                closeConnection(socket);
            }
        };

        Timer terminatingTimer = new Timer();
        if (isAuthentificated == false) {
            terminatingTimer.schedule(terminateConnection, 120000);
        }
    }

}

