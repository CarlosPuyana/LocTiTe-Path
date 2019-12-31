package U4.Tarea1.EJ1;

import java.util.Scanner;

public class cuentaCorriente {


    //Attributes:
    private double saldo;
    private int limiteDesc;
    private String nombre;
    private String dni;

    //Constructors:
    public cuentaCorriente(String nombre, String dni) {
        saldo = 0;
        limiteDesc = -50;
        this.nombre = nombre;
        this.dni = dni;
    }


    //Methods:
    public boolean sacarDinero(double peticion) {
        boolean resultado = false;

        if (saldo-peticion >= limiteDesc) {
            saldo -= peticion;
            resultado = true;
        }

        return resultado;
    }

    public void ingresarDinero(double ingreso) {

        saldo += ingreso;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del titular -> " + nombre
                + "\n"
                + "DNI -> " + dni
                + "\n"
                + "Saldo actual -> " + saldo);
    }


}
