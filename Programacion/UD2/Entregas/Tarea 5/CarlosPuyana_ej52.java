package Tarea5;

import java.util.Scanner;

public class CarlosPuyana_ej52 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Porfavor, introduzca el numero 12");
        int num1=teclado.nextInt();

        if (num1==12) {
            System.out.println("Has introducido correctamente el numero 12");
        } else {
            System.out.println("No has introducido correctamente el numero 12");
        }

    }
}
