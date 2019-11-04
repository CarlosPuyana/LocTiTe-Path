package Examen;

import java.util.Scanner;

public class PuyanaParaiso_CarlosEj4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;
        int suma=0, maximo, minimo, aux=0, aux2=1000, aux3=0, contador=0;
        float media=0;
        do {
            System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un\n" +
                    "número primo:");
            num = teclado.nextInt();

                contador++;


                if (num>aux) {
                    aux=num;
                }
                if (num<aux2) {
                    aux2=num;
                }
                aux3=num;
                suma=suma+aux3;

            media=suma/contador;
        } while (!((num%2!=0 && num!=1) || (num==2)));
       // while ((num%2!=0 && num!=1) || (num==2)) {

        //}


        System.out.println("El maximo es: " + aux);
        System.out.println("El minimo es: " + aux2);
        System.out.println("La suma es: " + suma);
        System.out.println(contador);
        System.out.print("El media es: " + media);

    }

}
