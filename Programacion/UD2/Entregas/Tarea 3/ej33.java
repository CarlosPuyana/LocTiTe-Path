package Tarea3;

import java.util.Scanner;

public class ej33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos numeros reales con decimales");
        double num1=teclado.nextDouble();
        double num2=teclado.nextDouble();

        System.out.println("La division de ambos numeros es: " + (num1/num2));

    }
}
