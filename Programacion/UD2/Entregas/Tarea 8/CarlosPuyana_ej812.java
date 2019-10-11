package Tarea8;

import java.util.Scanner;

public class CarlosPuyana_ej812 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cal1;
        boolean suspensos=false;

        for (int i=0; i<5; i++) {
            System.out.println("Introduce una nota");
            cal1 = teclado.nextInt();

            if (cal1 < 5) {
                suspensos = true;
            }
        }
            if (suspensos==true) {
                System.out.println("Hay alumnos suspensos");
            } else {
                System.out.println("No hay ningun alumno suspendido");
            }
    }
}
