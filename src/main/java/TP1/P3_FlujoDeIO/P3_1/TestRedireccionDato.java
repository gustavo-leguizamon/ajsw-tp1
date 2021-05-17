package TP1.P3_FlujoDeIO.P3_1;

import java.util.Scanner;

public class TestRedireccionDato {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = input.nextLine(); //GL: entrada de datos
        System.out.println("Hola " + nombre); //GL: salida de datos
    }
}
