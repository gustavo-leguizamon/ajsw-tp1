package Clase2.Ejemplos.Threads;

public class MyThread extends Thread {
    Table table;
    int value;
    String name;

    MyThread(Table table, int value, String name) {
        this.table = table;
        this.value = value;
        this.name = name;
    }

    public void run() {
        table.printTable(value, name);
        System.out.println("End " + name + " \r\n");
    }
}