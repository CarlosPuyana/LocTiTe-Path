package U3.Entregable;

import java.util.Scanner;

public class CarlosPuyana_ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int [] a = { };
        int [] b = { 8 };
        int [] c = { 6, 2, 5, 0, 1 , 5, 7, 23};

        System.out.println(convierteArrayEnString(a));
        System.out.println(convierteArrayEnString(b));
        System.out.println(convierteArrayEnString(c));
    }
    public static String convierteArrayEnString(int[] a) {
        String numero="";

        for (int value : a) {
            numero = numero + value;
        }

        return numero;
    }

}
