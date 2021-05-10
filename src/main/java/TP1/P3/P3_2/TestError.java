package TP1.P3.P3_2;

import java.util.Scanner;

public class TestError {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        String numero = input.nextLine(); //GL: entrada de datos
        System.out.println(5 + Integer.parseInt(numero)); //GL: salida de datos con error si el numero es otro caracter
    }
}
