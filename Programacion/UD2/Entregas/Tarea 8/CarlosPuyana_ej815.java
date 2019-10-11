package Tarea8;

import java.util.Scanner;

public class CarlosPuyana_ej815 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador=0;
        System.out.println("Introduce un numero");
        int num1=teclado.nextInt();

        for (int i=1;i<(num1-1);i++) {
            if ((i%2!=0 && i!=1) || (i==2)) {
                contador++;
            }
        }
        System.out.println("Entre 1 y " + num1 + " hay " + contador + " numeros primos");
    }
}
