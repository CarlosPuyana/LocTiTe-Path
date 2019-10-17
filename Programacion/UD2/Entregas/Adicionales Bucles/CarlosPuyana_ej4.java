package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int aux=0 , neg=0;
        System.out.println("Introduce 10 numeros");
        for (int i=0;i<10;i++) {
            int num1=teclado.nextInt();

            if (num1>0) {
                aux++;
            } else {
                neg++;
            }
        }
        System.out.println("Hay " + aux + " numeros positivos");
        System.out.println("Hay " + neg + " numeros negativos");
    }
}
