package U6.Tarea2;

import java.io.*;
import java.util.Scanner;

public class ej8_principal {
    public static void main(String[] args) throws ClassNotFoundException{
        Scanner teclado=new Scanner(System.in);
        ObjectOutputStream out=null;
        ObjectInputStream in=null;

        try {
            System.out.println("Escribe una linea: ");
            String texto=teclado.nextLine();
            out=new ObjectOutputStream(new FileOutputStream("datos.dat"));
            while (!texto.isEmpty()) {
                out.writeObject(texto);
                System.out.println("Escriba una linea:");
                texto=teclado.nextLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
            }
        }
        try {
            in=new ObjectInputStream(new FileInputStream("datos.dat"));
            try {
                while (true) {
                    String frase=(String) in.readObject();
                    System.out.println(frase);
                }
            } catch ( EOFException e) {

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in!=null) {
                    in.close();
                }
            } catch (IOException e) {
            }
        }
    }
}
