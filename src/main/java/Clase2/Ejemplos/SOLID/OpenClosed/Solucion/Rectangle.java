package Clase2.Ejemplos.SOLID.OpenClosed.Solucion;

public class Rectangle implements IGeometricShape {
    private double width;
    private double height;

    public Rectangle(double x, double y){
        this.width = x;
        this.height = y;
    }

    public double getWidth(){return this.width;}
    public double getHeight(){return this.height;}

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
