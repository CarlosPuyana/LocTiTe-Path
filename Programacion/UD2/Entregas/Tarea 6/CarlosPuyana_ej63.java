package Tarea6;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class CarlosPuyana_ej63 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numerito");
        int num1=teclado.nextInt();

        if (num1%2==0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
