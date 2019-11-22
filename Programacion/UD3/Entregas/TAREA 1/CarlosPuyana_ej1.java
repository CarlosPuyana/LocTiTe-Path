package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número:");
        int num = teclado.nextInt();
        teclado.nextLine();
        eco(num);

    }

    public static void eco(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("Eco...");
        }
    }
}
