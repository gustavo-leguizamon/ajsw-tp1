package TP1.P8_DB.P8_2;

public class Libro {
    private int _libroID;
    private String _nombre;
    private int _anio;

    public Libro(int libroID, String nombre, int anio){
        _libroID = libroID;
        _nombre = nombre;
        _anio = anio;
    }

    public int get_anio() {
        return _anio;
    }

    public int get_libroID() {
        return _libroID;
    }

    public String get_nombre() {
        return _nombre;
    }
}
