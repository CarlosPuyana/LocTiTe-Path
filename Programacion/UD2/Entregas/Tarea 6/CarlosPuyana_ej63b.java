package Tarea6;

import java.util.Scanner;

public class CarlosPuyana_ej63b {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numerito");
        int num1=teclado.nextInt();

        int resultado=(num1%2==0)?1:0;

        System.out.println(resultado);

    }
}
