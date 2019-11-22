package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige una opcion: ");
        System.out.println("1. Calcular el area");
        System.out.println("2. Calcular el volumen");
        int eleccion = teclado.nextInt();

        float base, altura;

        switch (eleccion) {
            case 1:
                System.out.println("Introduce el radio de la base y altura");
                base = teclado.nextFloat();
                altura = teclado.nextFloat();
                area(base, altura);
                break;
            case 2:
                System.out.println("Introduce el radio de la base y altura");
                base = teclado.nextFloat();
                altura = teclado.nextFloat();
                volumen(base, altura);
                break;
            default:
                System.out.print("Error");

        }

    }

    public static void area(float base, float altura) {
        double area_total;

        area_total=2*Math.PI*base*(altura+base);
        System.out.print("El area es: " + area_total);
    }

    public static void volumen(float base, float altura) {
        double volumen;

        volumen=Math.PI*Math.pow(base,2)*altura;
        System.out.print("El volumen es: " + (float) volumen);
    }
}
