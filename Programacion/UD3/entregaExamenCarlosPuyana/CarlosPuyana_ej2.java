package U3.Entregable;

import java.util.Scanner;

public class CarlosPuyana_ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] num = new int[4][5];

        System.out.println("Introduce 20 numeros enteros");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("Fila " + i + ", columna " + j + ": ");
                num[i][j] = teclado.nextInt();
            }
        }


        int contador;
        for(int i = 0; i < 4; i++) {
            contador = 0;
            for(int j = 0; j < 5; j++) {
                System.out.printf("%7d   ", num[i][j]);
                contador += num[i][j];
            }
            System.out.printf("|%7d\n", contador);
        }

        for(int j = 0; j < 5; j++) {
            System.out.print("----------");
        }
        System.out.println("-----------");

        int sumaColumna;
        int sumaTotal = 0;
        for(int j = 0; j < 5; j++) {
            sumaColumna = 0;
            for(int i = 0; i < 4; i++) {
                sumaColumna += num[i][j];
            }

            sumaTotal += sumaColumna;
            System.out.printf("%7d   ", sumaColumna);
        }
        System.out.printf("|%7d   ", sumaTotal);
    }
    }


