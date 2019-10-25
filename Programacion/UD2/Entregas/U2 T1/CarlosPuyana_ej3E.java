package Adicionales;

import java.util.Scanner;

public class CarlosPuyana_ej3E {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero a pasar a binario");
        int num = teclado.nextInt();

        String binario = "";
        if (num>0) {
            while (num>0) {
                if (num%2==0) {
                    binario="0" + binario;
                } else {
                    binario="1" + binario;
                }
                num=(int)num/ 2;
            }
        } else if (num==0) {
            binario="0";
        } else {
            binario="Solamente se puede convertir a binario numeros positivos";
        }
        System.out.println("El numero convertido a binario es: " + binario);


    }

}
