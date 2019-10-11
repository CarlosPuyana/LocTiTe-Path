package Tarea8;

import java.util.Scanner;

public class CarlosPuyana_ej81 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double num1=teclado.nextInt();

        while (num1!=0) {

            if (num1%2==0) {
                System.out.println("Es par");
            }
            if (num1>0) {
               System.out.println("El numero es positivo");
            }
            System.out.println("El cuadrado es: " + Math.pow(num1,2));

            System.out.println("Introduce un numero");
            num1=teclado.nextInt();
        }

        System.out.println();
    }


}
