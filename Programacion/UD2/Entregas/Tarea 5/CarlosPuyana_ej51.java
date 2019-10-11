package Tarea5;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class CarlosPuyana_ej51 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num1=teclado.nextInt();

        if (num1>0) {
            System.out.println("El numero introducido es positivo");
        } else if (num1<0) {
            System.out.println("El numero introducido es negativo");
        } else {
            System.out.println("Error, has introducido un 0");
        }

    }
}
