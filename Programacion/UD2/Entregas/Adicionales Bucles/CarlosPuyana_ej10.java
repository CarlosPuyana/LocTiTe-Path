package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura del la letra U");
        int altura=teclado.nextInt();

        if (altura>3) {
            for (int i = 0; i < altura - 1; i++) {
                System.out.print("*");
                for (int j = 0; j < 7; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");

            }
            for (int i = 0; i < 4; i++) {
                System.out.print(" *");
            }
        }
        else {
            for (int i = 0; i < altura - 1; i++) {
                System.out.print("*");
                for (int j = 0; j < 5; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");

            }
            for (int i = 0; i < 3; i++) {
                System.out.print(" *");
            }
        }
    }
}
