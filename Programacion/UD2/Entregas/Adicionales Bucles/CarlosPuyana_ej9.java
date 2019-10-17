package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura del la letra L");
        int altura=teclado.nextInt();

        for (int i=0;i<altura-1;i++) {
            System.out.println("*");
        }
        for (int i=0;i<(altura/2)+1;i++) {
            System.out.print("*  ");
        }

    }
}
