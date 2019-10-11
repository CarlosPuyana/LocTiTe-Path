package Tarea6;

import java.util.Scanner;

public class CarlosPuyana_ej62 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero del 1-10");
        int num1 = teclado.nextInt();

        switch (num1) {
            case 1:
                System.out.println("El mes introducido es 1");
                break;
            case 2:
                System.out.println("El mes introducido es 2");
                break;
            case 3:
                System.out.println("El mes introducido es 3");
                break;
            case 4:
                System.out.println("El mes introducido es 4");
                break;
            case 5:
                System.out.println("El mes introducido es 5");
                break;
            case 6:
                System.out.println("El mes introducido es 6");
                break;
            case 7:
                System.out.println("El mes introducido es 7");
                break;
            case 8:
                System.out.println("El mes introducido es 8");
                break;
            case 9:
                System.out.println("El mes introducido es nueve ");
                break;
            case 10:
                System.out.println("El mes introducido es diez ");
                break;
            default:
                System.out.println("No has introducido un numero del 1-10");
        }
    }
}