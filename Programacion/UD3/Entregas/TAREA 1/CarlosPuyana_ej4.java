package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos numeros enteros");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        mayor(num1,num2);
    }

    public static void mayor(int n1, int n2) {
        int mayor=0;
        if (n1 > n2) {
            mayor = n1;
        } else if (n1 < n2) {
            mayor = n2;

        }

        System.out.print("El numero mayor es " + mayor);
    }
}
