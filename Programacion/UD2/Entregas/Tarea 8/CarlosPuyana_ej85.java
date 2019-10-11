package Tarea8;

import java.util.Scanner;

public class CarlosPuyana_ej85 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce unos valores minimos y maximos");
        int min=teclado.nextInt();
        int max=teclado.nextInt();

        System.out.println("Introduce un numero entre los valores anteriormente introducidos");
        int num1=teclado.nextInt();

        while (!(num1>=min && num1<=max)) {
            System.out.println("Introduce un numero entre los valores anteriormente introducidos");
            num1=teclado.nextInt();
        }

        System.out.println("Gracias por todo");

    }
}
