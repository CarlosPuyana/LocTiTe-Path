<<<<<<< HEAD
package prueba;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        int numero=teclado.nextInt();
        int aux=0;
        boolean stop=false;
        while (stop=false) {
            int numeroaDividir=100;
            aux=numero/numeroaDividir;
            numeroaDividir=numeroaDividir/10;
            System.out.println(aux);
            if (aux==0) {
                stop=true;
            }
        }



       // System.out.println("El numero en morse es el siguiente: ");



        }


    }


=======
package prueba;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        int numero=teclado.nextInt();
        int aux=0;
        boolean stop=false;
        while (stop=false) {
            int numeroaDividir=100;
            aux=numero/numeroaDividir;
            numeroaDividir=numeroaDividir/10;
            System.out.println(aux);
            if (aux==0) {
                stop=true;
            }
        }



       // System.out.println("El numero en morse es el siguiente: ");



        }


    }


>>>>>>> 341e1c5a8e024e48f91a91423c657f3e781e1340
