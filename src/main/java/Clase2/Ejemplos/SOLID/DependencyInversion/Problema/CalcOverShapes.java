package Clase2.Ejemplos.SOLID.DependencyInversion.Problema;

public class CalcOverShapes {
    public static void main(String[] args){
        GreatCalcShapes greatCalcShapes = new GreatCalcShapes();
        greatCalcShapes.calculate();
        System.out.println("Area: " + greatCalcShapes.getTotalArea() + " perimeter: " + greatCalcShapes.getTotalPerimeter());
    }
}
