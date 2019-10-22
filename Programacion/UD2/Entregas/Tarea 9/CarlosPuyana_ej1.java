package Tarea9;

import java.util.Scanner;

public class CarlosPuyana_ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 2 palabras");
        String palabra1=teclado.next();
        String palabra2=teclado.next();

        if (palabra1.length()>palabra2.length()) {
            System.out.print("La palabra " + palabra2 + " es mas corta que " + palabra1 );
        } else {
            System.out.print("La palabra " + palabra1 + " es mas corta que " + palabra2 );
        }

    }

}
