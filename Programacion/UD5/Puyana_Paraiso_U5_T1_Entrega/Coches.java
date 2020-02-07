package U5.Entrega;

import U5.Tarea2.Ej2.Cliente;

import java.util.Comparator;

public class Coches extends Terrestre implements Comparable {

    protected int numPersona;
    public Coches(String nombre, String Matricula, int anoFabricacion, int numPersona, color color) {
        this.nombre=nombre;
        this.Matricula=Matricula;
        this.anoFabricacion=anoFabricacion;
        this.color=color;
        capacidadMax=5;
        tipo="Coche";
        if (numPersona<=capacidadMax) {
            this.numPersona=numPersona;
        }
    }

    @Override
    public String toString() {
        return "Es un " + tipo + " con Matricula: " + Matricula + ", Año de Fabricacion: " + anoFabricacion + " y color: " + color + " con una cantidad de " + numPersona
                + " en el vehiculo";
    }



    @Override
    public boolean equals(Object obj) {
        return Matricula.equals(((Coches) obj).Matricula);
    }


    @Override
    void transportar(int numero) {
        if (numPersona+capacidadMax<=capacidadMax) {
            this.numPersona+=numero;
        }
    }
}
