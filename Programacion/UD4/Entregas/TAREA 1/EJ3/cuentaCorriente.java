package U4.Tarea1.EJ3;

public class cuentaCorriente {
    //Attributes:
    private double saldo;
    private int limiteDesc;
    public String nombre;
    protected String dni;

    //Constructors:
    public cuentaCorriente(String nombre, String dni) {
        saldo = 0;
        limiteDesc = -50;
        this.nombre = nombre;
        this.dni = dni;
    }

    public cuentaCorriente(double saldo) {
        this.saldo=saldo;
        limiteDesc=0;
    }

    public cuentaCorriente(double saldo,int limiteDesc, String dni ) {
        this.saldo=saldo;
        this.limiteDesc=limiteDesc;
        this.dni=dni;
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
