package Tarea8;

import java.util.Scanner;

public class CarlosPuyana_ej814 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int n=teclado.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
