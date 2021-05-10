package Clase2.Ejemplos.SOLID.SingleResponsability.Solucion;

import java.util.List;

public class PerimeterOperation {
    public static double perimeter(Rectangle rectangle){
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    public static double sumPerimeter(List<Rectangle> rectangles) {
        return rectangles.stream().mapToDouble(r -> perimeter(r)).sum();
    }
}
