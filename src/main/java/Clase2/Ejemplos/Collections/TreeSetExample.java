package Clase2.Ejemplos.Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set treeSet = (Set) new TreeSet();

        treeSet.add("Volvo");
        System.out.println(treeSet);// [Volvo]

        // Alphabetical order
        treeSet.add("Audi");
        System.out.println(treeSet);// [Audi, Volvo]

        treeSet.add("Ford");
        System.out.println(treeSet);// [Audi, Ford, Volvo]

        // Volvo is Duplicate. So will not be added. returns false.
        treeSet.add("Volvo");// returns false since element is not added
        System.out.println(treeSet);// [Audi, Ford, Volvo]}
    }
}
