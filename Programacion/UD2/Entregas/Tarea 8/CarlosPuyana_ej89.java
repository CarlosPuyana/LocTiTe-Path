package Tarea8;

import java.util.Scanner;

public class CarlosPuyana_ej89 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int altura_arbol, aux=0;
        do {
            System.out.println("Cuanto mide el arbolito (en cm)");
            altura_arbol=teclado.nextInt();

            if (altura_arbol>aux) {
                aux=altura_arbol;
            }

        } while (altura_arbol!=-1);

        System.out.println("El arbol mas grande introducido es " + aux);


    }
}
