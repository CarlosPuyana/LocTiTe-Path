package U6.Tarea1;

import java.io.*;
import java.util.Scanner;

public class ej7_principal {
    public static void main(String[] args) throws IOException {
        Scanner teclado=new Scanner(System.in);
        int cont=0;

        try{
            BufferedReader f = new BufferedReader(new FileReader("src/U6/Tarea1/more.txt"));
            String linea=f.readLine();
            while(linea!=null){
                System.out.println(linea);
                cont++;
                if (cont==24){
                    System.out.println();
                    System.out.println("Pulse intro para contar otros 24.");
                    teclado.nextLine();
                    System.out.println();
                    cont=0;
                }
                linea=f.readLine();
            }
            f.close();
        }catch (EOFException e) {
            System.out.println("No se puede abrir el fichero");
        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        }
    }
}
