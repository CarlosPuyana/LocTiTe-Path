package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        short contra=1324;
        short contador=1;
        System.out.println("Introduce la clave de acceso a la caja fuerte (4 cifras)");
        short clave=teclado.nextShort();

        while (clave!=contra && contador<=3) {
            System.out.println("Lo siento, esa no es la combinacion");
            clave=teclado.nextShort();
            contador++;
        }
        if (contador==4) {
            System.out.println("Agotaste todas tus oportunidades, prueba luego");
        } else {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        }

    }
}
