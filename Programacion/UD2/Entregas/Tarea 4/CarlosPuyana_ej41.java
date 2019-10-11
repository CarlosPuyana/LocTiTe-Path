package Tarea4;

import java.util.Scanner;

public class CarlosPuyana_ej41 {
    public static void main(String[] args) {

        Short num_max = 32767;
        Short num_min = -32768;

        System.out.println("El numero minimo y maximo de tipo Short son: " + num_min + " " + num_max);

        System.out.println("Si restamos uno al minimo y sumamos uno al maximo, da: ");
        System.out.print((num_min-1) +" " + (num_max+1));

        // Te permite sumar 1 a una variable tipo short, pero no permite crear varaiables de mas de ese rango
    }
}