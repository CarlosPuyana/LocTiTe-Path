package Examen;

import java.util.Scanner;

public class PuyanaParaiso_CarlosEj1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int altura = teclado.nextInt();

        String fila="MMMMMM";

        while (!(altura%2==1 && altura>=5)) {
            System.out.println("La altura introducida no es correcta");
            System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
            altura = teclado.nextInt();
        }

        System.out.println();
        for (int i = 1; i <= altura/2; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == 6 || j == 1 || j == 6) {
                    System.out.print("M");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        for (int i = 1; i <= altura/2; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == 6 || j == 1 || j == 6) {
                    System.out.print("M");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println(fila);

    }
}