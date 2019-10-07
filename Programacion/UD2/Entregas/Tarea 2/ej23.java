package Tarea2;
import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos numeros a dividir: ");
        float num1 = teclado.nextFloat();
        float num2 = teclado.nextFloat();

        System.out.println("La division de "+num1+ " y "+num2+" es: "+(num1 / num2));

    }
}
