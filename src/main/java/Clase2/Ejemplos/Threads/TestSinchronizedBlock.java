package Clase2.Ejemplos.Threads;

class TestSynchronizedBlock{
    public static void main(String args[]){
        Table obj = new Table();//only one object
        MyThread t1=new MyThread(obj, 5, "T1");
        MyThread t2=new MyThread(obj, 100, "T2");
        t1.start();
        t2.start();
    }
}
