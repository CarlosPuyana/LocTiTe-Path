package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una letra");
        String cadena = teclado.nextLine();



        if (comprobarVocal(cadena)==true) {
            System.out.print("Es vocal");
        } else {
            System.out.print("No es vocal");
        }

    }

    public static boolean comprobarVocal(String frase){
        boolean booleano=false;

        if (frase.equalsIgnoreCase("a") || frase.equalsIgnoreCase("e")
                || frase.equalsIgnoreCase("i") || frase.equalsIgnoreCase("o") || frase.equalsIgnoreCase("u")) {
            booleano=true;
        }

        return booleano;
    }

}
