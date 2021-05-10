package Clase2.Ejemplos.SOLID.SingleResponsability.Problema;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalcOverShapes {
    public static void main(String[] args){
        List<Rectangle> rectangles = Arrays.asList(new Rectangle(12, 23), new Rectangle(7,5), new Rectangle(18,4));
        double sumArea = Rectangle.sumAreas(rectangles);
        double sumPerimeter = Rectangle.sumPerimeters(rectangles);
        System.out.println("Area: %s " + sumArea + " perimeter: " + sumPerimeter);
    }
}
