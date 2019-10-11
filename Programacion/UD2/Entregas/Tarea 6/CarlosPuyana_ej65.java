package Tarea6;

import java.util.Scanner;

public class CarlosPuyana_ej65 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el radio");
        float radio = teclado.nextFloat();

        System.out.println("Por favor, elige una opcion: ");
        System.out.println("1.Calcular diámetro");
        System.out.println("2.Calcular perímetro");
        System.out.println("3.Calcular área");
        int eleccion = teclado.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("El diametro es de " + (2*radio));
                break;
            case 2:
                System.out.println("El perimetro es de " + (2*Math.PI*radio));
                break;
            case 3:
                System.out.println("El area es de " + (Math.PI*radio*radio));
                break;
            default:
                System.out.println("Error");
        }
    }
}
