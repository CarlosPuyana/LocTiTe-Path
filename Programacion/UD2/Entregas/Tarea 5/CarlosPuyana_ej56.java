package Tarea5;

import java.util.Scanner;

public class CarlosPuyana_ej56 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final double gravedad=9.8;

        System.out.println("Introduce el valor del tiempo");
        double tiempo=teclado.nextDouble();

        double velocidad=gravedad*tiempo;

        if (tiempo!=0 && tiempo>0) {

            System.out.println("La velocidad es: " + velocidad);
        } else {
            System.out.println("Error, el tiempo no puede ser negativo o O");
        }
    }
}
