package Tarea8;

import java.util.Scanner;

public class CarlosPuyana_ej88 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int aux=1;

        System.out.println("Introduce un numero porfavor");
        int num1=teclado.nextInt();

        for (int i=num1;i>0;i--) {
            aux=aux*i;

            }
        System.out.println(aux);
        }

    }

