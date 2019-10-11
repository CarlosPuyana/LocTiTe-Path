package Tarea4;

import java.util.Scanner;

public class CarlosPuyana_ej43 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tres notas");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();

        int media= (int) ((nota1+nota2+nota3)/3);

        System.out.println("La nota media de tu curso es: " + media);
    }

}
