package Tarea5;

import java.util.Scanner;

public class CarlosPuyana_ej55 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 3 numeros largos");
        int num1=teclado.nextInt();
        int num2=teclado.nextInt();
        int num3=teclado.nextInt();

        if (num1>num2 && num1>num3) {
            System.out.println("El mayor de todos es: " + num1);
        }else if (num2>num1 && num2>num3) {
            System.out.println("El mayor de todos es: " + num2);
        } else {
            System.out.println("El mayor de todos es: " +num3);
        }


    }
}
