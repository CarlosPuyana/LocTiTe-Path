package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int mayor=0, menor=0;

        System.out.println("Introduce dos numeros enteros: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();



        comprendido(num1,num2);
    }

    public static void comprendido(int num1, int num2) {
        int mayor=0, menor=0;
        if (num1>num2) {
            mayor=num1;
            menor=num2;
        } else if (num1<num2) {
            mayor=num2;
            menor=num1;
        }
        for (int i=menor+1; i<mayor; i++) {
            System.out.print(i + " ");
        }
    }

}
