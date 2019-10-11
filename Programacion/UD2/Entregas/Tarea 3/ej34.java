package Tarea3;

import java.util.Scanner;

public class ej34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digame una longitud en millas a pasar a KM");
        double millas = teclado.nextDouble();

        double km = millas * (1.609);

        System.out.print("La longitud de " + millas + " millas en KM son: " + km);

    }
}
