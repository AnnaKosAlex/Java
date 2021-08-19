package leveltwo.lesson2_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private ServerSocket socket;
    private Socket client;
    private DataInputStream in;
    private DataOutputStream out;
    private Scanner scanner;

    public Server() {
        init();
        communicate();
        System.out.println("Closing the connection...");
        System.out.println("Shutting down...");
        System.out.println("STATUS OK.");
    }

    private void init() {
        try {
            socket = new ServerSocket(8899);
            System.out.println("Socket created...");
            System.out.println("Waiting for a connection...");
            client = socket.accept();
            System.out.println("Client connected...");
            System.out.println(client);
            System.out.println("STATUS OK.");
        } catch (IOException e) {
            System.out.println("STATUS NOT OK.");
            e.printStackTrace();
        }
    }

    private void communicate() {
        try {
            in = new DataInputStream(client.getInputStream());
            out = new DataOutputStream(client.getOutputStream());
            scanner = new Scanner(System.in);


            new Thread( () -> {
                try {
                    while (true) {
                        String inMessage = in.readUTF();
                        if (inMessage.equals("exit")) {
                            out.writeUTF("Bye!");
                            System.out.println("Client interrupted connection");
                            System.out.println("Press Enter for ending of the seance");
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

            new Thread( () -> {
                try {
                    while(true) {

                        System.out.println("You:");
                        String outMessage = scanner.nextLine();
                        System.out.println();
                        if (outMessage.equals("exit")) {
                            System.out.println("Connection close");
                            out.writeUTF("exit");
                            closeConnection();
                        }
                        out.writeUTF(outMessage);
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            }).start();

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

