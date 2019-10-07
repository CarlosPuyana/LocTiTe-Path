package Tarea2;

import java.util.Scanner;

public class ej25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digame la temperatura en grados");
        int cent = teclado.nextInt();

        int faren = cent*(9/5)+32;
        System.out.println(cent+ "°C son "+ faren + " grados Fahrenheit" );

    }

}
