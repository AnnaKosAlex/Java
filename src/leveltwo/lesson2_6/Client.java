package leveltwo.lesson2_6;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Client {

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private Scanner scanner;

    public Client() {
        init();
        communicate();
    }

    private void init() {
        try {
            Thread.sleep(3000);
            socket = new Socket("localhost", 8899);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void communicate() {
        try {
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            scanner = new Scanner(System.in);

            AtomicBoolean isAlive = new AtomicBoolean(true);

            new Thread( () -> {
                try {
                    while (true) {
                        String inMessage = in.readUTF();
                        if (inMessage.equals("exit")) {
                            out.writeUTF("Bye!");
                            System.out.println("Client interrupted connection");
                            System.out.println("Press Enter for ending os the seance");
                            closeConnection();

                        }
                        System.out.println("Client:");
                        System.out.println(inMessage);
                        System.out.println();


                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            }).start();

            while (true) {
                if (!isAlive.get()) {
                    System.out.println("Client closing...");
                    System.out.println("STATUS OK.");
                    break;
                }

                System.out.println("Please input message...");
                String outboundMessage = scanner.nextLine();
                out.writeUTF(outboundMessage);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection(){

        try {
            in.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        try {
            out.close();
        } catch(IOException e){
            e.printStackTrace();
        }

        try {
            socket.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        scanner.close();
        System.exit(0);
    }
}