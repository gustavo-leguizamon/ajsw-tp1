package Clase2.Ejemplos.SOLID.LiskovSubstitution.Problema;

public class Square extends Rectangle {
    public Square(double x, double y) { super(x, y); }

    public Square(double x) { super(x, x); }
}
