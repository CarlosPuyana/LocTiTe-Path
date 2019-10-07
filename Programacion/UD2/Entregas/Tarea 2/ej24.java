package Tarea2;

import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una longitud a millas por favor");
        float millas = teclado.nextFloat();

        float metros=millas*1609;

        System.out.print("La longitud de "+millas+ " millas en metros son: "+ metros);

    }
}
