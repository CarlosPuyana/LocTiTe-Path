package U6.Tarea1;

import java.io.*;

public class ej3a_principal {
    public static void main(String[] args) {
        try{
            BufferedReader f1 = new BufferedReader(new FileReader("src/U6/Tarea1/original.txt"));
            BufferedWriter f2 = new BufferedWriter(new FileWriter("src/U6/Tarea1/copia.txt"));

            int c = f1.read();
            while (c != -1) {
                f2.write(c);
                c=f1.read();
            }
            f1.close();f2.close();

        } catch (EOFException eof) {
            System.out.println("Error de fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
