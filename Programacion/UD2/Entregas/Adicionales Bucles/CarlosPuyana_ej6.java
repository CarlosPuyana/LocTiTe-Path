package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce numero de filas que tendra la piramide: ");
        int alt=teclado.nextInt();
        System.out.print("Introduce el caracter con el que construir la piramide: ");
        String caracter=teclado.next();
        int altura = 1;
        int i = 0;
        int espaciosDelante = alt - 1;
        int espaciosInternos = 0;

        while (altura<alt) {
            for (i=1;i<=espaciosDelante;i++) {
                System.out.print(" ");
            }
            System.out.print(caracter);
            for (i=1;i<espaciosInternos;i++) {
                System.out.print(" ");
            }
            if (altura>1) {
                System.out.print(caracter);
            }
            System.out.println();
            altura++;
            espaciosDelante--;
            espaciosInternos += 2;
        }
        for (i=1;i<altura*2;i++) {
            System.out.print(caracter);
        }
    }
    }
