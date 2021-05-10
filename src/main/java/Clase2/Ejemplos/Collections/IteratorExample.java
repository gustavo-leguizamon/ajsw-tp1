package Clase2.Ejemplos.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        LinkedList<Estudiante> lista = new LinkedList<Estudiante>();
        lista.add(new Estudiante("Juan", 85));
        lista.add(new Estudiante("Maria", 45));
        lista.add(new Estudiante("Pedro", 51));
        ListIterator<Estudiante> iterador = lista.listIterator();
        while (iterador.hasNext()) {
            Estudiante e = iterador.next();
            System.out.println(e.getName());
        }
        System.out.println("sigo con el mismo iterador");
        while (iterador.hasPrevious()) {
            Estudiante e = iterador.previous();
            System.out.println(e.getName());
        }
    }
}