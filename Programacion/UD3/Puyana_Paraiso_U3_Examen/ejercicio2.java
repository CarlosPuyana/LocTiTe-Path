package prueba;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos numeros largos");
        long a=teclado.nextLong();
        long b=teclado.nextLong();

        System.out.print("Los dos numeros juntos son: " + juntaNumeros(a, b));

    }

    public static long juntaNumeros(long a, long b) {
        String primerNum = String.valueOf(a);
        String segunNum = String.valueOf(b);

        String juntos = primerNum + segunNum;
        long resultado = Integer.parseInt(juntos);


        return resultado;
    }
}
