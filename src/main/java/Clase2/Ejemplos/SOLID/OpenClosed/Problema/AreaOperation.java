package Clase2.Ejemplos.SOLID.OpenClosed.Problema;

import java.util.List;

public class AreaOperation {
    public static double area(IShape shape) {
        if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getWidth() * ((Rectangle) shape).getHeight();
        } else if (shape instanceof EquilateralTriangle) {
            return Math.sqrt(3) * Math.pow(((EquilateralTriangle) shape).getLength(), 2) / 4;
        }
        return 0;
    }

    public static double sumArea(List<IShape> shapes){
        return shapes.stream().mapToDouble(s -> area(s)).sum();
    }
}