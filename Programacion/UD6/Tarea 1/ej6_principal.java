package U6.Tarea1;

import java.io.*;
import java.util.Scanner;

public class ej6_principal {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner (System.in);
        System.out.println("¿Que deseas hacer?");
        System.out.println("   1.Mostrar libro de firmas: \n   2.Añadir nombre: ");
        int eleccion=teclado.nextInt();
        teclado.nextLine();

        switch (eleccion){
            case 1:
                verLibro();
                break;
            case 2:
                System.out.println("Introduce el nombre en el libro de firmas: ");
                String nombre=teclado.nextLine();
                insertarNombre(nombre);
                break;
        }

    }

    static void insertarNombre(String nuevo) throws IOException{
        try {
            final String defecto="src/U6/Tarea1/librofirmas.txt";
            BufferedReader f = new BufferedReader(new FileReader(defecto));
            String nombre=f.readLine();
            boolean encontrado=false;

            while(nombre!=null && encontrado==false){
                if (nombre.equals(nuevo)){
                    encontrado=true;
                }
                nombre=f.readLine();
            }
            f.close();

            if (encontrado==false){
                BufferedWriter w = new BufferedWriter(new FileWriter(defecto,true));
                w.newLine();
                w.write(nuevo);
                System.out.println("\n Se ha insertado un nuevo nombre.");
                w.close();
            } else{
                System.out.println("\n Ya ha firmado anteriormente.");
            }

        } catch (EOFException e) {
            System.out.println("No se puede abrir el fichero");;
        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        }
    }
    static void verLibro() throws IOException {
        try {
            final String defecto="src/U6/Tarea1/librofirmas.txt";
            BufferedReader f = new BufferedReader(new FileReader(defecto));
            String linea = f.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = f.readLine();
            }
            f.close();

        } catch (EOFException e) {
            System.out.println("No se puede abrir el fichero");;
        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        }
    }
}
