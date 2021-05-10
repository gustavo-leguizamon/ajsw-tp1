package TP1.P3.P3_6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestGuardarArchivoXML {
    public static void main(String args[]) throws IOException {
        try{
            FileWriter file = new FileWriter("c:/Users/Hukummi/Desktop/ficheroGeneradoJAVA.xml");
            file.write("<header>\n");
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 5; i++){
                System.out.println("Ingrese un texto: ");
                String texto = input.nextLine(); //GL: entrada de datos
                file.write("<line>Linea " + (i + 1) + ": " + texto + "</line>\n"); //GL: salida de datos al fichero
            }
            file.write("</header>");
            file.close();
        }
        catch (Exception ex){
            System.out.println("No se puedo guardar el archivo.");
        }
        finally {
            System.out.println("Programa terminado.");
        }
    }
}
