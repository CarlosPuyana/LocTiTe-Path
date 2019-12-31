<<<<<<< HEAD
package prueba;

import java.lang.reflect.Array;
import java.util.Arrays;

  /* En general, para conseguir un número entero entre M y N con M menor que N y ambos incluídos, debemos usar esta fórmula

        int valorEntero = Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos.*/

public class ejercicio1 {
    public static void main(String[] args) {
        int[][] tabla = new int[9][9];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j]= (int) (Math.random()*(500-900+1)+900);
            }
        }

        /*for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.println(tabla[i][j]);
            }
        }*/

        int[] b= new int[9];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 8; j >= 0; j--) {
                b[i]=tabla[i][j];
            }
        }
        System.out.println(Arrays.toString(b));

        int mayor=0, suma=0, menor=1000, aux=0, media=0;
        for (int i = 0; i < b.length; i++) {

            aux=b[i];
            if (aux>mayor) {
                mayor=aux;
            }
            if (aux < menor){
                menor=aux;
            }

            suma=suma+aux;
        }
        media=suma/b.length;
        System.out.println("El mayor es: " + mayor + " el menor: "+ menor + " la suma de todos es: " + suma);
        System.out.println("La media es: " + media);

    }
}
=======
package prueba;

import java.lang.reflect.Array;
import java.util.Arrays;

  /* En general, para conseguir un número entero entre M y N con M menor que N y ambos incluídos, debemos usar esta fórmula

        int valorEntero = Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos.*/

public class ejercicio1 {
    public static void main(String[] args) {
        int[][] tabla = new int[9][9];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j]= (int) (Math.random()*(500-900+1)+900);
            }
        }

        /*for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.println(tabla[i][j]);
            }
        }*/

        int[] b= new int[9];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 8; j >= 0; j--) {
                b[i]=tabla[i][j];
            }
        }
        System.out.println(Arrays.toString(b));

        int mayor=0, suma=0, menor=1000, aux=0, media=0;
        for (int i = 0; i < b.length; i++) {

            aux=b[i];
            if (aux>mayor) {
                mayor=aux;
            }
            if (aux < menor){
                menor=aux;
            }

            suma=suma+aux;
        }
        media=suma/b.length;
        System.out.println("El mayor es: " + mayor + " el menor: "+ menor + " la suma de todos es: " + suma);
        System.out.println("La media es: " + media);

    }
}
>>>>>>> 341e1c5a8e024e48f91a91423c657f3e781e1340
