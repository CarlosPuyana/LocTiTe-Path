package U5.Tarea2.Ej2;

import java.util.Arrays;

public class principal {
    public static void main(String[] args) {
        Cliente [] c1 = new Cliente[5];

        c1 [0] = new Cliente("1232D", "Carlos", 12, 123);
        c1 [1] = new Cliente("1232B", "Carlitos", 12, 124);
        c1 [2] = new Cliente("1232C", "Carlos Brown", 16, 126);
        c1 [3] = new Cliente("1232A", "Carlitos Brown", 18, 1237);
        c1 [4] = new Cliente("1232E", "Carlos Cansado", 19, 128);

        Arrays.sort(c1);
        System.out.println("Por DNI: " + Arrays.toString(c1));
        Arrays.sort(c1, new compararNombres());
        System.out.println("Por Nombres: " + Arrays.toString(c1));
        Arrays.sort(c1, new compararEdad());
        System.out.println("Por edad: " + Arrays.toString(c1));


    }
}
