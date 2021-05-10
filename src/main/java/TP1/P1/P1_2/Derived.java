package TP1.P1.P1_2;

public class Derived extends Base{
    //@Override //GL: ERROR, no se puede sobreescribir un metodo que no existe para la clase hija, ya que en el padre este es privado
    private static void display(){
        System.out.println("Static or class method from Derived");
    }

    @Override
    public void print(){
        System.out.println("Static or class method from Derived");
    }
}
