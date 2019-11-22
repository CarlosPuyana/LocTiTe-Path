package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();

        System.out.print("Hay " + primos(numero) + " primos por detras de el");

    }
    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if ((numero%i)==0){
                return false;
            }
        }
        return true;
    }

    public static int primos (int numero) {
        int contador=1;

        for (int i = 2; i<numero ; i++) {
            if (esPrimo(i)) {
                contador++;
            }
        }

        return contador;
    }
}
