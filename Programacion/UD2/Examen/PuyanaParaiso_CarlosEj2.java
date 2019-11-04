package Examen;

import java.util.Scanner;

public class PuyanaParaiso_CarlosEj2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        String num = teclado.next();

        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int posicion=teclado.nextInt();

        String subcadena="";
        String subcadena2="";
        subcadena=num.substring(0,posicion-1);
        subcadena2=num.substring(posicion-1,num.length());

        System.out.print("Los números partidos son el " + subcadena + " y el " + subcadena2);

    }
}
