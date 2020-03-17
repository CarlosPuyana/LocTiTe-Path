package U6.Tarea1;

import java.io.*;
import java.util.Scanner;

public class ej1_principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final String defecto="src/U6/Tarea1/prueba.txt";

        System.out.println("Escriba el nombre del fichero, por defecto es: prueba.txt");
        String fichero=teclado.nextLine();

        if (fichero.isEmpty()) {
            fichero=defecto;
        }
        try {
            BufferedReader f = new BufferedReader(new FileReader(fichero));
            int c = f.read();
            while (c != -1) {
                System.out.println((char) c);
                c=f.read();
            }
            f.close();
        } catch (EOFException eof) {
            System.out.println("El fichero no se pudo abrir");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
