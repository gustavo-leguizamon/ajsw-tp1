package Clase2.Ejemplos.SOLID.DependencyInversion.Problema;

public class EquilateralTriangle implements IGeometricShape {
    private double side = 3;
    private double length;

    public EquilateralTriangle(double x){
        length = x;
    }

    public double getSide() {
        return side;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.sqrt(3) * Math.pow(length, 2) / 4;
    }

    @Override
    public double perimeter() {
        return length * 3;
    }
}