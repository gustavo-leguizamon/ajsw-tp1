package Clase2.Ejemplos.SOLID.SingleResponsability.Problema;

import java.util.List;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int x, int y){
        this.width = x;
        this.height = y;
    }

    public int getWidth(){return this.width;}
    public int getHeight(){return this.height;}

    public static double area(Rectangle rectangle){
        return rectangle.getWidth() * rectangle.getHeight();
    }

    public static double perimeter(Rectangle rectangle){
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    public static double sumAreas(List<Rectangle> rectangles){
        return rectangles.stream().mapToDouble((r -> Rectangle.area(r))).sum();
    }

    public  static double sumPerimeters(List<Rectangle> rectangles){
        return rectangles.stream().mapToDouble(r -> Rectangle.perimeter(r)).sum();
    }
}
