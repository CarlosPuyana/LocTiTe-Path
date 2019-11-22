package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca 3 numeros para averiguar el mayor de todos");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();


        int mayor1=mayor(num1,num2);
        int num3 = teclado.nextInt();
        System.out.print("El mayor es: " + mayor(mayor1,num3));
    }

    public static int mayor(int n1, int n2) {
        int mayor=0;
        if (n1 > n2) {
            mayor=n1;
        } else if (n1 < n2) {
            mayor=n2;
        }
        return mayor;


    }

}
