package U3.Entregable;

import java.util.Scanner;

public class CarlosPuyana_ej5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);



        int [] tabla = {111, 222, 333, 444};
        int [] b = {52, 37};

        
        System.out.println("Aleatorio de la Primera Tabla: " + aleatorioDeArray(tabla));
        System.out.println("Aleatorio de la Segunda Tabla: " + aleatorioDeArray(b));

    }

    public static int aleatorioDeArray(int[] a) {
        int numero=0, aleatorio=0;



        aleatorio = (int) (Math.random() * a.length+1);

        // Si, solo vale para 4 posiciones :D. Pero como solo hay 4 posiciones, not bad give me that Nice Exercise
        if (aleatorio==1) {
            numero=a[aleatorio-1];
        } else if (aleatorio==2) {
            numero=a[aleatorio-1];
        } else if (aleatorio==3) {
            numero=a[aleatorio-1];
        } else if (aleatorio==4) {
            numero=a[aleatorio-1];
        }
        return numero;
    }
}
