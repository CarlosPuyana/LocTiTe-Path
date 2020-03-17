package U6.Tarea2;

import java.io.*;
import java.util.Arrays;

public class ej9_principal {
    public static void main(String[] args) {
        ObjectInputStream in=null;
        ObjectOutputStream out=null;
        int tabla[] = new int[10];

        try {
            for (int i = 0; i < tabla.length; i++) {
                tabla[i]=(int) (Math.random() *100);
                }
            out=new ObjectOutputStream((new FileOutputStream("numerosAleatorios.dat")));
            Arrays.sort(tabla);
            out.writeObject(tabla);
            } catch (IOException e) {
            System.out.println(e.getMessage());
            } finally {
            if (out!=null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        try {
            in=new ObjectInputStream(new FileInputStream("numerosAleatorios.dat"));
            try {
                tabla = (int[]) in.readObject();
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(Arrays.toString(tabla));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (in!=null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
