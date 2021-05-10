package Clase2.Ejemplos.SOLID.DependencyInversion.Problema;

import java.util.Arrays;
import java.util.List;

public class GreatCalcShapes {
    private double totalArea = 0;
    private double totalPerimeter = 0;

    public double getTotalArea() {
        return totalArea;
    }

    public double getTotalPerimeter() {
        return totalPerimeter;
    }

    public void calculate(){
        List<IGeometricShape> shapeList = Arrays.asList(new Rectangle(12,23), new Square(7), new Rectangle(18,4), new EquilateralTriangle(8));
        totalArea = sumAreas(shapeList);
        totalPerimeter = sumPerimeters(shapeList);
    }

    public double sumAreas(List<IGeometricShape> shapes){
        return shapes.stream().mapToDouble(s -> AreaOperation.area(s)).sum();
    }

    public double sumPerimeters(List<IGeometricShape> shapes){
        return shapes.stream().mapToDouble(s -> PerimeterOperation.perimeter(s)).sum();
    }
}
