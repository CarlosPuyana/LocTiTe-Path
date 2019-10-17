package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para darle la vuelta");
        int num1=teclado.nextInt();
        int i;

        for (i=0;num1>0;num1/=10,i*=10) {
            i+=num1%10;
        }
        System.out.println(i/10);

    }
}
