package Tarea6;

import java.util.Scanner;

public class CarlosPuyana_ej61 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el numero de un mes, gracias");
        int mes=teclado.nextInt();

        switch (mes) {
            case 1:
                System.out.println("El mes introducido es Enero");
                break;
            case 2:
                System.out.println("El mes introducido es Febrero");
                break;
            case 3:
                System.out.println("El mes introducido es Marzo");
                break;
            case 4:
                System.out.println("El mes introducido es Abril");
                break;
            case 5:
                System.out.println("El mes introducido es Mayo");
                break;
            case 6:
                System.out.println("El mes introducido es Junio");
                break;
            case 7:
                System.out.println("El mes introducido es Julio");
                break;
            case 8:
                System.out.println("El mes introducido es Agosto");
                break;
            case 9:
                System.out.println("El mes introducido es Septiembre ");
                break;
            case 10:
                System.out.println("El mes introducido es Octumbre ");
                break;
            case 11:
                System.out.println("El mes introducido es Noviembre");
                break;
            case 12:
                System.out.println("El mes introducido es Diciembre");
                break;
            default:
                System.out.println("No has introducido un numero del 1-12");

        }

    }
}
