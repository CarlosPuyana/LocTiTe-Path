package Tarea9;

import java.util.Scanner;

public class CarlosPuyana_ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Primer jugador: ");
        System.out.print("Introduce una contraseña: ");
        String contrasena=teclado.next();
        String j2;

        do {
            System.out.println("Segundo Jugador: ");
            j2=teclado.next();
            int comparacion=contrasena.compareTo(j2);

            if (comparacion==0) {
                System.out.println("Acertaste");
            } else if (comparacion<0){
                System.out.println("Es menor");
            } else {
                System.out.println("Es mayor");
            }
        } while (!contrasena.equals(j2));
    }
}
