package Clase2.Ejemplos.SOLID.SingleResponsability.Solucion;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int x, int y){
        this.width = x;
        this.height = y;
    }

    public int getWidth(){return this.width;}
    public int getHeight(){return this.height;}
}
