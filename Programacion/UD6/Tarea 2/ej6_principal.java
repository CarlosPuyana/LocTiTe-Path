package U6.Tarea2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ej6_principal {
    public static void main(String[] args) {
        ObjectInputStream in=null;

        try {
            in=new ObjectInputStream(new FileInputStream("datos.dat"));
            try{
                while (true) {
                    System.out.println(in.readDouble());
                }
            } catch (EOFException e) {

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if (in!=null) {
                    in.close();
                }
            } catch (IOException e) {

            }
        }
    }
}
