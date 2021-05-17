package TP1.P3_FlujoDeIO.P3_5;

public class MyThread extends Thread {
    private Datos _datos;
    private String _in;
    private String _out;

    public MyThread(Datos datos, String in, String out){
        _datos = datos;
        _in = in;
        _out = out;
    }

    public void run(){
        _datos.Print(_in, _out);
        System.out.println("End " + _out + " \r\n");
    }
}
