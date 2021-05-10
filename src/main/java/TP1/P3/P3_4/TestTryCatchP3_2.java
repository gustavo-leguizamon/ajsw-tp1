package TP1.P3.P3_4;

import java.util.Scanner;

public class TestTryCatchP3_2 {
    public static void main(String args[]){
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            String numero = input.nextLine(); //GL: entrada de datos
            System.out.println(5 + Integer.parseInt(numero)); //GL: salida de datos con error si el numero es otro caracter
        }
        catch (Exception ex){
            System.out.println("No se pudo mostrar el resultado.");
        }
        finally {
            System.out.println("Programa terminado.");
        }
    }
}
