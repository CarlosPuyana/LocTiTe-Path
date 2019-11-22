package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero, para averiguar el factorial");
        int num1 = teclado.nextInt();

        System.out.println(factorial(num1));

    }
    static int factorial (int n) {
        int resultado=1;
        int aux=0;

        if (n==0) {
            resultado=resultado*1;
        } else {
            resultado=n*factorial((n-1));
        }
        return resultado;
    }

}
