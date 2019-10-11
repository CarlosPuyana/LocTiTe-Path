package Tarea3;

import java.util.Scanner;

public class ej31 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Porfavor, introduce 2 numeros de 2 cifras a sumar");
        byte num1 = teclado.nextByte();
        byte num2 = teclado.nextByte();

        System.out.println("La suma de los numeros, " + num1 + " y " + num2 + " es: " +(num1+num2));

    }
}
