package Clase2.Ejemplos.SOLID.OpenClosed.Problema;

import java.util.List;

public class PerimeterOperation {
    public static double perimeter(IShape shape){
        if (shape instanceof Rectangle){
            return 2 * (((Rectangle)shape).getWidth() + ((Rectangle)shape).getHeight());
        }
        else if (shape instanceof EquilateralTriangle){
            return ((EquilateralTriangle)shape).getLength() * 3;
        }
        return 0;
    }

    public static double sumPerimeter(List<IShape> shapes){
        return shapes.stream().mapToDouble(s -> perimeter(s)).sum();
    }
}
