package U3.Tarea4;

import java.util.Scanner;

public class CarlosPuyana_ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos numeros deseas introducir");
        int num = teclado.nextInt();
        int media_pos=0, media_neg=0;
        int suma_pos=0, suma_neg=0;
        int contador_pos=0, contador_neg=0, contador_cero=0;

        int [] tablita = new int[num];

        System.out.println("Introduce los numeros");
        for (int i = 0; i < tablita.length; i++) {
            tablita[i]=teclado.nextInt();

            if (tablita[i]>0) {
                suma_pos=suma_pos+tablita[i];
                contador_pos++;
            } else if (tablita[i]<0){
                suma_neg=suma_neg+tablita[i];
                contador_neg++;
            } else {
                contador_cero++;
            }
        }

            media_pos = suma_pos / contador_pos;
            media_neg = suma_neg / contador_neg;

        System.out.print("La media de los numeros positivos son: " + media_pos + " y la de los numeros negativos: " + media_neg + " .");
        System.out.println(" Hay exactamente " + contador_cero + " ceros");


    }

}
