package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca numero de filas: ");
        int numFilas = teclado.nextInt();
        System.out.print("Introduzca el caracter: ");
        String caracter=teclado.next();


        System.out.println();
        for(int i = 1; i<=numFilas; i++){
            for(int j=1;j<=numFilas-i;j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(i*2)-1; k++){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
