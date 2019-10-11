package Tarea6;

import java.util.Scanner;

public class CarlosPuyana_ej64a {

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce 2 numeros");
            byte num1 = teclado.nextByte();
            byte num2 = teclado.nextByte();
            if (num1>num2){
                byte menor=num2;
                System.out.println("El valor introducido menor es: " + menor);
            }
            else{
                byte menor=num1;
                System.out.println("El valor introducido menor es: " + menor);
            }
        }
    }
