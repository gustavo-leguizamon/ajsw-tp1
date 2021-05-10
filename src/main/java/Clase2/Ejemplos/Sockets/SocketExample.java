package Clase2.Ejemplos.Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketExample {
    public static void main(String[] args){
        Socket socketServicio= null;
        ServerSocket socketSrv= null;

        try {
            socketServicio= socketSrv.accept();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
