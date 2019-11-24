package U3.Tarea3;

import java.util.Scanner;

public class CarlosPuyana_ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String frase = "";
        System.out.println("Escribe una palabra: ");
        String palabra = teclado.nextLine();

        while (!palabra.toLowerCase().equals("fin")) {
            frase = frase + " " + palabra;

            System.out.println("Escribe una palabra: ");
            palabra=teclado.nextLine();
        }
        System.out.println(frase);
    }

}
