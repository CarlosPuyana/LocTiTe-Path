package Examen;

import java.util.Scanner;

public class PuyanaParaiso_CarlosEj5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase");
        String cadena = teclado.nextLine();

        char vocal1 ='a';
        char vocal2= 'e';
        char vocal3= 'i';
        char vocal4='o';
        char vocal5='u';
        int contador=0;

        for (int i=0; i<cadena.length();i++){
            char posicion=cadena.charAt(i);
            if (posicion == vocal1 || posicion == vocal2 || posicion == vocal3 || posicion == vocal4 || posicion == vocal5) {

                contador++;
            }
        }
        System.out.println("La cantidad de vocales es" + contador);
    }
}
