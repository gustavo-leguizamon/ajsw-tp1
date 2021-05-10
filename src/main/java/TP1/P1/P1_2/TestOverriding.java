package TP1.P1.P1_2;

public class TestOverriding {
    public static void main(String args[]){
        Base obj1 = new Derived();
        //obj1.display(); //GL: ERROR, no se puede acceder a un metodo privado
        obj1.print();}
}
