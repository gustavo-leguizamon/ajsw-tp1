package TP1.P4.P4_2;

import java.util.HashMap;
import java.util.Map;

public class TestLibros {
    public static void main(String[] args){
        Map<Integer, String> map = getMapBooks();
        map.forEach((k,v) -> System.out.printf("ISBN: %s, Libro: %s %n", k, v));
    }

    public static Map<Integer, String> getMapBooks(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "libro1");
        map.put(2, "libro2");
        map.put(3, "libro3");
        return map;
    }
}
