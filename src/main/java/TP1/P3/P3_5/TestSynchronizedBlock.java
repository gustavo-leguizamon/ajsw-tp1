package TP1.P3.P3_5;

public class TestSynchronizedBlock{
    public static void main(String args[]){
        Datos obj = new Datos();//only one object
        MyThread t1=new MyThread(obj, "Entrada 1", "T1");
        MyThread t2=new MyThread(obj, "Entrada 2", "T2");
        t1.start();
        t2.start();
    }
}
