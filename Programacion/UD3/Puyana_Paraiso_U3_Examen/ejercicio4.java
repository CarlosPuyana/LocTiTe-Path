package prueba;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] tabla = {212, 131, 234};


        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(tabla));
        System.out.println(Arrays.toString(filtracapicuas(tabla)));
        filtracapicuas(tabla);

    }

    public static int[] filtracapicuas(int x[]) {
        long falta = 0,numeroInvertido = 0,resto;
        int[] tabla = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            while (x[i]<=0);
                falta=x[i];
                numeroInvertido=0;
                resto=0;

            resto=falta%10;
            falta=falta/10;
            numeroInvertido=numeroInvertido*10+resto;
            while(falta!=0) {
                resto=falta%10;
                numeroInvertido=numeroInvertido*10+resto;
                falta=falta/10;
            }
            if(numeroInvertido==x[i]) {
                int aux;
                aux=x[i];
                tabla[i]=aux;
            }
        }
        Arrays.sort(tabla);
       tabla=eliminarCeros(tabla);
        int[] tabla2={-1};
        if (tabla.length==0) {
            return tabla2;
        }else {
            return tabla;
        }
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


