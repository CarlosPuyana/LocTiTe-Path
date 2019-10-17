package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int altura=0;

        System.out.println("Introduce la altura de la letra X");
        altura=teclado.nextInt();

        while (altura<3 || altura%2==0) {
            System.out.println("Error, prueba de nuevo");
            altura=teclado.nextInt();
        }

        for (int i=1; i<=altura; i++) {
            for (int j=1; j<=altura; j++) {
                if ((i==j) || (j==(altura-i)+1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }

