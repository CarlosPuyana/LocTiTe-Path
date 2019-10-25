package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej2E {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        long num = teclado.nextLong();

        boolean capicuo = false;
        long num_inutiles = num;
        long num_dig = 0;
        long num_reves = 0;

        while (num_inutiles > 0){
            num_reves = ((num_reves*10) + (num_inutiles % 10));
            num_inutiles /=10;
            num_dig++;
        }

        long num_derecho = num;
        long cifra_bien = 0;
        long cifra_reves = 0;
        num_dig /= 2;

        do{
            cifra_bien = num_derecho%10;
            cifra_reves = num_reves%10;

            if (cifra_bien == cifra_reves){
                capicuo = true;
            } else {
                capicuo = false;
            }

            num_derecho /= 10;
            num_reves /= 10;
            num_dig--;
        } while ((num_dig > 0) && (capicuo == true));


        if (capicuo == true){
            System.out.print("El número " + num + " es un numero capicuo.");
        } else {
            System.out.print("El número " + num + " no es un numero capicuo.");
        }


    }
}
