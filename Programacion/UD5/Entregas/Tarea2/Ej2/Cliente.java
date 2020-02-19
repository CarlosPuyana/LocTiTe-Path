package U5.Tarea2.Ej2;

public class Cliente implements Comparable {
    protected String dni;
    protected String nombre;
    protected int edad;
    protected int saldo;

    public Cliente(String dni, String nombre, int edad, int saldo) {
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.saldo=saldo;
    }

    @Override
    public String toString() {
        return "DNI CLIENTE: " + dni + " Nombre: " + nombre + " edad " + edad + " Saldo: " + saldo;
    }

    @Override
    public boolean equals(Object obj) {
        return dni.equals(((Cliente) obj).dni);
    }

    @Override
    public int compareTo(Object o1) {
        return dni.compareTo(((Cliente) o1).dni);
    }
}
