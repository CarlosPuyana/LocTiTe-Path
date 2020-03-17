package U6.Tarea2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

public class ej4_principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        ObjectOutputStream out=null;

        try {
            System.out.println("Numero de elementos: ");
            int n=teclado.nextInt();

            double tabla[]=new double[n];
            out=new ObjectOutputStream(new FileOutputStream("datos.dat"));
            for (int i = 0; i < tabla.length; i++) {
                System.out.println("Introduce un numero real");
                tabla[i]=teclado.nextDouble();
            }
            out.writeObject(tabla);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (out!=null) {
                    out.close();
                }
            } catch (IOException e){

            }
        }
    }
}
