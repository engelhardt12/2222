package server;

import java.net.ServerSocket;

public class Echoserver {
    public ststic void main(String[] args) {
        ServerSocket server = new ServerSocket( port: 8189);
        System.out.println("Server started...");
        while (true){
            Socket socket = server.accept();
            System.out.println("Client accepted...");
            StringMessageHandler handler = new StringMessageHandler(socket);
            new Thread(handler).start();
        }
    }
}
