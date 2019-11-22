package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 2 numeros, para saber si son amigos o se caen mal");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        amigos(num1,num2);

    }

    public static void amigos(int num1, int num2) {
        int aux=0;

        for (int i = 1; i < num1 ; i++) {
            if (num1%i==0) {
                aux=aux+i;
            }
        }
        if (aux==num2) {
            System.out.print("Son amigos");
        } else {
            System.out.print("Se caen fatal");
        }

    }

}
