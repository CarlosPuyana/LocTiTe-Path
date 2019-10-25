package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej5E {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto");
        int max=11;
        String texto=teclado.nextLine();


        int longitud=texto.length();

        for(int i=1;i<=max;i=i+2) {
            for(int k=max+1;k>=i;k=k-2) {
                System.out.print(" ");
            }

            for(int j=0;j<i;j++) {
                //String subcadena=texto.substring(0,i);
                //System.out.print(subcadena);
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=max;i>=1;i=i-2) {
            for(int k=i;k<=max+2;k=k+2)
            {
                System.out.print(" ");
            }
            for(int j=(i-2);j>0;j--) {

                System.out.print("*");
                //System.out.print(texto);
            }
            System.out.println();
        }

    }

}
