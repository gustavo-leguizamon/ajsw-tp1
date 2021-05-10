package Clase2.Ejemplos.Collections;

import java.util.Arrays;
import java.util.List;

public class ListSorter {
    public static void main(String[] args) {
        List<String> l1 = createList();
        l1.sort(null);
        l1.forEach(System.out::println);
        List<String> l2 = createList();
        l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        l2.forEach(System.out::println);
        List<String> l3 = createList();
        l3.sort(String::compareToIgnoreCase);
        l3.forEach(System.out::println);
    }

    private static List<String> createList() {
        return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
    }
}
