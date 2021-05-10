package Clase2.Ejemplos.SOLID.OpenClosed.Problema;

public class Rectangle implements IShape {
    private int width;
    private int height;

    public Rectangle(int x, int y){
        this.width = x;
        this.height = y;
    }

    public int getWidth(){return this.width;}
    public int getHeight(){return this.height;}
}