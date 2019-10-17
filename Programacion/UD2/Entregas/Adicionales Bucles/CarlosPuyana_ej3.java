package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a=0, b=1, c;

        System.out.println("Introduce un numero");
        int n=teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(a + "  ");
            c = a + b;
            a = b;
            b = c;
        }

    }
}
