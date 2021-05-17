package TP1.P4_Collections.P4_1;

import java.util.Arrays;
import java.util.List;

public class TestCompras {
    public static void main(String[] args){
        List<Compra> compras = getComprasList();
        //compras.stream().map(c -> c + "");

        for (Compra compra : compras){
            System.out.println("Compra: " + compra.get_numero() + ", Producto: " + compra.get_producto());
        }
    }

    private static List<Compra> getComprasList(){
        return Arrays.asList(
                new Compra(1,"manzana"),
                new Compra(2, "azucar"),
                new Compra(3,"raiz"),
                new Compra(8, "oso"));
    }
}
