package Clase2.Ejemplos.SOLID.DependencyInversion.Solucion;

import java.util.List;

public class AreaOperation {
    public static double area(IGeometricShape shape){
        return shape.area();
    }

    public static double sumAreas(List<IGeometricShape> shapes){
        return shapes.stream().mapToDouble(s -> area(s)).sum();
    }
}
