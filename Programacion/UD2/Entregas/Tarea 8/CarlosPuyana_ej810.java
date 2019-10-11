package Tarea8;

import java.util.Scanner;

public class CarlosPuyana_ej810 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero del 1-10");
        int num1=teclado.nextInt();

        while (!(num1>=1 && num1<=10)) {
            System.out.println("Introduce un numero del 1-10");
            num1=teclado.nextInt();
        }
        for (int i=1;i<=10;i++) {
            System.out.println(i + "*" + num1 + "=" + (i*num1));
        }

    }
}
