package U5.Entrega;

public class Helicoptero extends Aereo {

    protected int numPersona;

    public Helicoptero(String nombre, String OACI, int altitud, int numPersona) {
        this.nombre=nombre;
        this.OACI=OACI;
        this.altitud=altitud;
        capacidadMax=9;
        tipo="Helicoptero";
        if (numPersona<=capacidadMax) {
            this.numPersona=numPersona;
        }
    }

    @Override
    void transportar(int numero) {
        if (numPersona+capacidadMax<=capacidadMax) {
            this.numPersona+=numero;
        }
    }

    @Override
    public String toString() {
        return "Es un " + tipo + " con codigo OACI: " + OACI + ", volando a una altitud de: "
                + altitud + " metros y con una cantidad de " + numPersona
                + " en el vehiculo";
    }
}
