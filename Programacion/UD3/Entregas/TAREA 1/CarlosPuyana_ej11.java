package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero real, y un entero positivo");
        float num_real= teclado.nextFloat();
        int entero_noneg=teclado.nextInt();

        System.out.println("Iterativa:" + iterativa(num_real, entero_noneg));
        System.out.println("Recursiva:" + recursiva(num_real, entero_noneg));

    }

    public static float iterativa(float a, int n) {
        float resultado=1;

        for (int i = 1; i <=n ; i++) {
            resultado=(resultado*a);
        }
        return resultado;
    }

    static float recursiva(float a, int n) {
        if (n<=1) {
            return a;
        }else {
            return a*recursiva(a,(n-1));
        }
    }

}
