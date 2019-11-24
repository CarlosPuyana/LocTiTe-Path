package U3.Tarea4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CarlosPuyana_ej5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

       /* System.out.println("");
        int num1 = teclado.nextInt();
        */
        int[] tabla = new int[6];
        int[] tabla2 = new int[6];
        int[] tabla3 = new int[tabla.length+tabla2.length];

        System.out.println("Introduce 6 valores para la siguiente tabla");
        for (int i = 0; i < tabla.length ; i++) {
            System.out.print(i+1 + ". ");
            tabla[i]=teclado.nextInt();
        }

        System.out.println("Introduce 6 valores para la siguiente tabla");
       for (int i = 0; i < tabla2.length ; i++) {
           System.out.print(i+1 + ". ");
            tabla2[i]=teclado.nextInt();
        }

       Arrays.sort(tabla);
       Arrays.sort(tabla2);
        System.out.println("Tabla 1: " + Arrays.toString(tabla));
        System.out.println("Tabla 2: " + Arrays.toString(tabla2));

        int j=0;
        for (int i = 0; i <tabla.length ; i++) {
            tabla3[j]=tabla[i];
            j++;
            tabla3[j]=tabla2[i];
            j++;
        }
        /*System.out.print("[ ");
        for (int i = 0; i < tabla3.length; i++) {
            System.out.print(tabla3[i] + " ");*//**//*
        }
        System.out.println(" ]");*/

        Arrays.sort(tabla3);
        System.out.println("Tabla Mezclada: " + Arrays.toString(tabla3));
        System.out.println();






    }




}
