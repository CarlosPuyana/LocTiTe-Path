package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero=teclado.nextInt();

        System.out.print(esPrimo(numero));

    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if ((numero%i)==0){
                return false;
            }
        }
        return true;
    }

}
