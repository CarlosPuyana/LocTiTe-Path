<<<<<<< HEAD
package prueba;

import java.util.Arrays;

public class ejercicio5 {
    public static void main(String[] args) {

        int[][] tabla = new int[6][4];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j]= (int) (Math.random()*(100));
            }
        }

        System.out.println(Arrays.toString(corteza(tabla)));

    }

    public static int[] corteza(int[][] n) {
        int[] tabla = new int[16];
        for (int i = 0; i < 6; i++) {
                tabla[i]=n[i][0];
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 6; j < 9; j++) {
             tabla[j]=n[5][i];
            }
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 9; j < 14; j++) {
            tabla[j]=n[i][3];
            }
        }
        for (int i = 2; i >=1; i--) {
            for (int j = 14; j < 16; j++) {
            tabla[j]=n[0][i];
            }
        }
        return tabla;
    }
}
=======
package prueba;

import java.util.Arrays;

public class ejercicio5 {
    public static void main(String[] args) {

        int[][] tabla = new int[6][4];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j]= (int) (Math.random()*(100));
            }
        }

        System.out.println(Arrays.toString(corteza(tabla)));

    }

    public static int[] corteza(int[][] n) {
        int[] tabla = new int[16];
        for (int i = 0; i < 6; i++) {
                tabla[i]=n[i][0];
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 6; j < 9; j++) {
             tabla[j]=n[5][i];
            }
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 9; j < 14; j++) {
            tabla[j]=n[i][3];
            }
        }
        for (int i = 2; i >=1; i--) {
            for (int j = 14; j < 16; j++) {
            tabla[j]=n[0][i];
            }
        }
        return tabla;
    }
}
>>>>>>> 341e1c5a8e024e48f91a91423c657f3e781e1340
