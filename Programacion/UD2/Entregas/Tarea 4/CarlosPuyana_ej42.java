package Tarea4;

import java.util.Scanner;

public class CarlosPuyana_ej42 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos notas");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();

        System.out.println("La nota media de tu curso es: " + ((nota1 + nota2) / 2));
    }
}
