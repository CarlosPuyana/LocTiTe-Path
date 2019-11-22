package U3.Entregable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CarlosPuyana_ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] tabla = { 7, 27, 77, 33, 87};

        System.out.println(Arrays.toString(filtraCon7(tabla)));
    }

    static int[] filtraCon7(int x[]) {
        String numero="";
        int [] tabla = new int[x.length];

        for (int i=0; i<x.length;i++) {
            numero=numero+x[i];
            if (numero.contains("7")) {
                //System.out.println(x[i]);
                tabla[i]=x[i];
            }
            numero="";
        }
        Arrays.sort(tabla);
        eliminarCeros(tabla);
        return tabla;

    }
    static int[] eliminarCeros(int t[]) {
        int contador=0;
        for (int i = 0; i < t.length; i++) {
            if (t[i]==0) {
                contador++;
            }
        }

        return Arrays.copyOfRange(t, contador, t.length);
    }

}
