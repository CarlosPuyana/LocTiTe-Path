package Tarea3;

import java.util.Scanner;

public class ej32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digame su año de nacimiento y el año actual, porfavor.");
        short ano_nac=teclado.nextShort();
        short ano_actual=teclado.nextShort();

        System.out.println("Su edad es de: " + (ano_actual-ano_nac));


    }
}
