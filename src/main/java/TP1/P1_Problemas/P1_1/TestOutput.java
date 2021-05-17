package TP1.P1_Problemas.P1_1;

public class TestOutput {
    public static void main(String args[]){
        Parent obj1 = new Child();
        Child obj2 = new Child();
        obj1.foo(); //GL: Se ejecuta el foo del Parent, el metodo foo es de clase, no de instancia
        obj2.foo(); //GL: Se ejecuta el doo del Child, el metodo foo es de clase, no de instancia
        obj1.bar(); //GL: Se ejecuta bar en Child
        obj2.bar(); //GL: Se ejecuta bar en Child
        Parent.foo(); //GL: Se ejecuta foo como metodo de clase en Parent
        Child.foo(); //GL: Se ejecuta foo como metodo de clase en Child
    }
}
