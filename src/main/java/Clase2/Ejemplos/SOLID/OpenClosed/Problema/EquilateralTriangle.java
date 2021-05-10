package Clase2.Ejemplos.SOLID.OpenClosed.Problema;

public class EquilateralTriangle implements IShape {
    private int side = 3;
    private int length;

    public EquilateralTriangle(int x){
        length = x;
    }

    public int getSide() {
        return side;
    }

    public int getLength() {
        return length;
    }
}
