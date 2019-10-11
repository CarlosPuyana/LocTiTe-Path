package Tarea4;

import java.util.Scanner;

public class CarlosPuyana_ej44 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digame un numero decimal");
        float num1=teclado.nextFloat();

        System.out.println("El numero redondeado es: ");
        System.out.print(Math.round(num1));
    }
}
