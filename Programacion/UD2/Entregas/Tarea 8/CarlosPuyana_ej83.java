package Tarea8;

import java.util.Scanner;

public class CarlosPuyana_ej83 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num_azar= (int) (Math.random()*101);

        System.out.println("Intente, adivinar el numero, del 1-100");
        int num1=teclado.nextInt();

            while (num1!=num_azar && num1>0) {
                if (num1 > num_azar) {
                    System.out.println("El numero es menor al introducido");
                    num1 = teclado.nextInt();
                }
                if (num1 < num_azar) {
                    System.out.println("El numero es mayor al introducido");
                    num1 = teclado.nextInt();
                }

            }

        if (num1==num_azar) {
            System.out.println("Enhorabuena, has acertado el numero");
        } else if (num1==-1) {
            System.out.println("Te rendiste wey");
        }

    }
}
