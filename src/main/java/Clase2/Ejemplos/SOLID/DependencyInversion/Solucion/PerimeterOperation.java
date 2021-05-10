package Clase2.Ejemplos.SOLID.DependencyInversion.Solucion;

import java.util.List;

public class PerimeterOperation {
    public static double perimeter(IGeometricShape shape){
        return shape.perimeter();
    }

    public static double sumPerimeters(List<IGeometricShape> shapes){
        return shapes.stream().mapToDouble(s -> perimeter(s)).sum();
    }
}
