package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej1E {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce las 3 notas");
        short nota1 = teclado.nextShort();
        teclado.nextLine();
        short nota2 = teclado.nextShort();
        teclado.nextLine();
        short nota3 = teclado.nextShort();
        teclado.nextLine();

        int suma=nota1+nota2+nota3;
        double media=suma/3;
        String nota_final="";

        if (media>=5 && media<=10) {

            if (media >= 5 && media < 6) {
                nota_final = "Suficiente";
            } else if (media >= 6 && media < 7) {
                nota_final = "Bien";
            } else if (media >= 7 && media < 9) {
                nota_final = "Notable";
            } else {
                nota_final = "Sobresaliente";
            }
        } else {
            System.out.print("Cual ha sido el resultado de la recuperacion? (apto/no apto) ");
            String recupe=teclado.nextLine();
            if (recupe.equals("apto")) {
                nota_final="Suficiente";
                media=5;
            } else {
                nota_final="Suspenso";
            }
        }

        System.out.print("Tu nota de programacion es: " + media + " " + nota_final);

    }
}
