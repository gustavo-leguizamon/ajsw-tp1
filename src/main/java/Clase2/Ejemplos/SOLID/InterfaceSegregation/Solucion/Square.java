package Clase2.Ejemplos.SOLID.InterfaceSegregation.Solucion;

import Clase2.Ejemplos.SOLID.LiskovSubstitution.Solution.IGeometricShape;

public class Square implements IGeometricShape {
    private double side = 4;
    private double length;

    public Square(double x){length = 4;}

    public double getSide() {
        return side;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.pow(length, 2);
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }
}
