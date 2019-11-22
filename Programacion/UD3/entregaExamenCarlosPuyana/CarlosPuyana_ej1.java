package U3.Entregable;

import java.util.Scanner;

public class CarlosPuyana_ej1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int [] mesa = new int[10];
        int num=0;

        do {
            System.out.println("- Camarero: Buenos dias, ¿Cuantos sois?");
            System.out.print("- Cliente: ");
            for (int i = 0; i < 10; i++) {

            }
            num = teclado.nextInt();
        } while (num!=-1 && (num>0 && num<5));

        if (num>5 || num<0) {
            System.out.println("Lo siento, no admitimos grupos de " + num + ", haga grupos de 4 personas\n" +
                    "como máximo e intente de nuevo");
        }






    }


}
