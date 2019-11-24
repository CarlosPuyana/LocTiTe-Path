package U3.Tarea3;

import java.util.Scanner;

public class CarlosPuyana_ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numEspacios=0;
        char c;

        System.out.println("Escribe una frase: ");
        String frase = teclado.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            c=frase.charAt(i);
            if (Character.isSpaceChar(c)) {
                numEspacios++;
            }
        }
        System.out.println("Tiene " + numEspacios + " espacios en blanco");

    }

}
