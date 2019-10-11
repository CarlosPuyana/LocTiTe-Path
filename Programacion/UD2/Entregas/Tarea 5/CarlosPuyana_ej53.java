package Tarea5;

import java.util.Scanner;

public class CarlosPuyana_ej53 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero, porfavor.");
        int num1=teclado.nextInt();

        if (num1%2==0) {
            System.out.println("El numero introducido es par");
        } else if (num1%2==1) {
            System.out.println("El numero introducido es impar");
        } else {
            System.out.println("Has introducido un numero negativo");
        }

    }
}
