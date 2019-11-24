package U3.Tarea4;

import java.util.Scanner;

public class CarlosPuyana_ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos numeros deseas introducir");
        int num1= teclado.nextInt();


        int [] cadena = new int[num1];

        System.out.println("Introduce los numeros: ");

        for (int i = 0; i < cadena.length; i++) {
            cadena[i]=teclado.nextInt();
        }

        System.out.println("Los numeros son: ");
        for (int i = cadena.length-1; i >= 0; i--) {
            System.out.print(cadena[i] + " ");
        }
    }

}
