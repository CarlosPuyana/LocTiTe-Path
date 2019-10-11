package Tarea8;

import java.util.Scanner;

public class CarlosPuyana_ej84 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduce un numero");
        int num1=teclado.nextInt();

        for (int i=1;i<=num1;i++) {
            if (i<num1) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }

    }
}
