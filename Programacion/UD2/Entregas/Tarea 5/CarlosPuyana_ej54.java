package Tarea5;

import java.util.Scanner;

public class CarlosPuyana_ej54 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos numeros");
        int num1=teclado.nextInt();
        int num2=teclado.nextInt();

        if (num1%2==0 && num2%2==0) {
            System.out.println("Ambos numeros son pares");
        }
        else if (num1%2==1 && num2%2==1) {
            System.out.println("Ningun numero es par");
        } else {
            System.out.println("Un numero es par");
        }

    }
}
