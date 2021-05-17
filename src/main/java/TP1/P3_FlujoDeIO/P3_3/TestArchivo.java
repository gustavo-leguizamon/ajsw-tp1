package TP1.P3_FlujoDeIO.P3_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestArchivo {
    public static void main(String args[]) throws IOException {
        FileWriter file = new FileWriter("c:/Users/Hukummi/Desktop/ficheroGeneradoJAVA.txt");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese un texto: ");
            String texto = input.nextLine(); //GL: entrada de datos
            file.write("Linea " + (i + 1) + ": " + texto + "\n"); //GL: salida de datos al fichero
        }
        file.close();
    }
}
