package Clase2.Ejemplos.Collections;

public class Estudiante {
    private String _nombre;
    private int _edad;

    public Estudiante(String nombre, int edad){
        this._nombre = nombre;
        this._edad = edad;
    }

    public String getName(){
        return this._nombre;
    }
}
