package Clase2.Ejemplos.SOLID.OpenClosed.Solucion;

import java.util.Arrays;
import java.util.List;

public class CalcOverShapes {
    public static void main(String[] args){
        List<IGeometricShape> rectangles = Arrays.asList(new Rectangle(12, 23), new Rectangle(7,5), new Rectangle(18,4));
        double sumArea = AreaOperation.sumAreas(rectangles);
        double sumPerimeter = PerimeterOperation.sumPerimeters(rectangles);
        System.out.println("Area: %s " + sumArea + " perimeter: " + sumPerimeter);
    }
}
