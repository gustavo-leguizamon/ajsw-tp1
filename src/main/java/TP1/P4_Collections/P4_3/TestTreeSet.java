package TP1.P4_Collections.P4_3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Set treeSet = new TreeSet();
        int fin = 0;
        while (fin < 10){
            System.out.println("Ingrese un DNI:");
            String documento = input.nextLine();
            treeSet.add(documento);
            fin++;
        }
        System.out.println(treeSet);
    }
}
