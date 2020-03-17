package U6.Tarea2;

import java.io.*;
import java.util.Scanner;

public class ej7_principal {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner teclado =new Scanner(System.in);
        ObjectOutputStream out=null;
        ObjectInputStream in=null;

        try{
            System.out.println("Escriba una frase: ");
            String frase=teclado.nextLine();
            out=new ObjectOutputStream((new FileOutputStream("datos.dat")));
            out.writeObject(frase);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (out!=null) {
                    out.close();
                }
            } catch (IOException e) {
            }
        }
        try {
            in=new ObjectInputStream(new FileInputStream("datos.dat"));
            System.out.println((String) in.readObject());
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
