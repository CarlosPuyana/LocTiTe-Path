package U3.Tarea4;

import java.util.Scanner;

public class CarlosPuyana_ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float [] datos = new float[5];

        System.out.println("Introduce los valores: ");
        for (int i = 0; i <datos.length ; i++) {
            datos[i]=teclado.nextFloat();
        }

        System.out.print("Los valores son: ");
        for (int i = 0; i <datos.length ; i++) {
            System.out.print(datos[i] + " ");
        }

    }

}
