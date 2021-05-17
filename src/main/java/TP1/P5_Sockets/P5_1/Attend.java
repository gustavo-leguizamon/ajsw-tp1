package TP1.P5_Sockets.P5_1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

class Attend extends Thread{
    private BufferedReader bufferedReader;
    private DataOutputStream outputStream;
    private String recive;
    private Socket client = null;
    private String nameDirIP;

    public Attend(Socket client){
        this.client = client;
        nameDirIP = this.client.getInetAddress().toString();
    }

    public void run(){
        try{
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            outputStream = new DataOutputStream(client.getOutputStream());
            do{
                recive = bufferedReader.readLine();
                System.out.println("("+ nameDirIP +") Llego: " + recive);
                if(recive!=null) {
                    outputStream.writeInt(recive.length());
                }
            }while(recive!= null && recive.length()!=0);
            bufferedReader.close();
            client.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        System.out.println("Ya se desconecto"+"("+ nameDirIP +")");
    }
}
