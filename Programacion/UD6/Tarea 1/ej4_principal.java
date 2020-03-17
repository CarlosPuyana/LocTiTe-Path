package U6.Tarea1;

import java.io.*;

public class ej4_principal {
    public static void main(String[] args) {
        try {
            BufferedReader f = new BufferedReader(new FileReader("src/U6/Tarea1/carta.txt"));
            int conCaracter=0, conPalabra=0, conLinea=0;
            int c= f.read();

            while (c != -1) {
                if ((char) c==' ') {
                    conCaracter++;
                    conPalabra++;
                } else if ((char) c=='\n') {
                        conPalabra++;
                        conLinea++;
                    } else {
                        conCaracter++;
                    }
                c = f.read();
                }

            f.close();

            if (conPalabra>0) {
                conPalabra++;
            }
            if (conLinea>=0) {
                conLinea++;
            }

            System.out.println("Hay " + conCaracter + " caracteres, " + conPalabra + " palabras y " + conLinea + " lineas.");

        } catch (EOFException ef) {
            System.out.println("Error de archivo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
