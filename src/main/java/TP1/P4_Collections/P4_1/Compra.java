package TP1.P4_Collections.P4_1;

public class Compra {
    private int _numero;
    private String _producto;

    public Compra(int numero, String producto){
        _numero = numero;
        _producto = producto;
    }

    public int get_numero() {
        return _numero;
    }

    public String get_producto() {
        return _producto;
    }
}
