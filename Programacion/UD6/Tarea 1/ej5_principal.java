package U6.Tarea1;

import java.io.*;

public class ej5_principal {
    public static void main(String[] args) {
        try {
            BufferedReader f = new BufferedReader( new FileReader("src/U6/Tarea1/numeros.txt"));
            int num, mayor, menor;

            String cifra=f.readLine();
            num=Integer.valueOf(cifra);
            mayor=num; menor=num;
            while (cifra != null) {
                num=Integer.valueOf(cifra);
                if (num > mayor) {
                    mayor=num;
                } if (num < menor) {
                    menor=num;
                }
                cifra=f.readLine();
            }
            f.close();
            System.out.println("El numero mayor es: " + mayor + ". Y el menor: " + menor);
        } catch (EOFException eof) {
            System.out.println("Error de archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
