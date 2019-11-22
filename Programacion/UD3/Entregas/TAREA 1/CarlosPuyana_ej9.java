package U3.Tarea1;

import java.util.Scanner;

public class CarlosPuyana_ej9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero para mostrar los numeros primos de tal");
        int num = teclado.nextInt();

        System.out.println("Los numeros primos que se pueden dividir " + num + " son: ");
        divisoresPrimos(num);
    }

    static void divisoresPrimos(int num){
        boolean primo = true;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                for (int j=2;j<i && primo;++j){
                    if (i%j==0){
                        primo =false;
                    }
                }
                if (primo){
                    System.out.print (i+"  ");
                }
            }
        }
    }

}
