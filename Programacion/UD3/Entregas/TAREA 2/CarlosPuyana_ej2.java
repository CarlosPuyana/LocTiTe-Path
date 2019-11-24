package Tarea9;

import java.util.Scanner;

public class CarlosPuyana_ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Primer jugador: ");
        System.out.print("Introduce una contraseña: ");
        String contrasena=teclado.next();

        int longitud=contrasena.length();

        System.out.println("Segundo Jugador: ");
        System.out.println("Intente adivinar la contraseña, las pistas son: ");
        System.out.print("La contraseña tiene " + contrasena.length() + " caracteres");
        System.out.print(", la primera letra es: " + contrasena.charAt(0));
        System.out.println(" y la ultima: " + contrasena.charAt(longitud-1));
        String j2=teclado.next();

        if (contrasena.equals(j2)) {
            System.out.println("Acertaste");
        } else {
            System.out.println("Fallaste");
        }
    }
}
