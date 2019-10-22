package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_Cocentrico  {

    public static void main(String[] args) {

        int numCuad = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el tamaño del cuadrado exterior");
        int num=teclado.nextInt();

        while (num%2==0 || num<3) {
            System.out.println("El tamaño debe ser impar y mayor que 3");
            System.out.println("Introduce el tamaño del cuadrado exterior");
            num=teclado.nextInt();
        }


        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                if ((i%2==0 && j>=i && j<=num-1-i) || (i%2==0 && i+j >=num-1 && j<=i)
                        || (j%2==0 && i>=j && j<=num-i-1) || (j%2==0 && i+j>=num-1 && i<=j)) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }

            }

            System.out.println();
        }
    }
}