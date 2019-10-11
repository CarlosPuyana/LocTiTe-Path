package Tarea6;

import java.util.Scanner;

public class CarlosPuyana_ej64b {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 2 numeros");
        byte num1 = teclado.nextByte();
        byte num2 = teclado.nextByte();

        byte menor=(num1>num2)?num2:num1;
        System.out.println(menor);
    }
}
