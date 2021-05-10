package TP1.P5.P5_1;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args){
        ServerSocket serverSocket = null;
        Socket client = null;
        boolean listen = true;
        try{
            serverSocket = new ServerSocket(15000);
            System.out.println("Socket listen en puerto 15000");
            while(listen){
                client = serverSocket.accept();
                System.out.println("Ya se conecto un client desde: " +
                        client.getInetAddress().getHostName()+
                        "("+client.getPort()+")");
                new Attend(client).start();
            }
            serverSocket.close();
        }catch (IOException e){
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}
