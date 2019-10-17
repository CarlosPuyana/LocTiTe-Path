package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);



        System.out.println("Introduce un numero");
        int num1=teclado.nextInt();

        int num_aux=num1-1;

        for (int i=0;i<5;i++) {
            num_aux++;
            System.out.print(num_aux);
            for (int j=0;j<20;j++) {
                System.out.print(" ");
            }
            for (int k=0;k<1;k++) {
                System.out.print(Math.pow(num_aux,2));
            }
            for (int j=0;j<20;j++) {
                System.out.print(" ");
            }
            for (int k=0;k<1;k++) {
                System.out.println(Math.pow(num_aux,3));
            }
        }




    }
}
