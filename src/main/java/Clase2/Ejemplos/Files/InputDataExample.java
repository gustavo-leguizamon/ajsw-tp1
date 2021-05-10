package Clase2.Ejemplos.Files;

import java.util.Scanner;

public class InputDataExample {
    public static void main(String[] args){
        try{
            //Declaro Scanner para la lectura de datos
            Scanner reader = new Scanner(System.in);
            String texto = reader.next();
            while(!texto.equals("FIN")){
                texto = reader.next();
                System.out.print(texto);
            }
        }
        catch(Exception ex){

        }
    }
}
