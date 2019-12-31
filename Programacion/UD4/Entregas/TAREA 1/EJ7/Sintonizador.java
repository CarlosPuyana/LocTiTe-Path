package U4.Tarea1.EJ7;

public class Sintonizador {
    private double frecuencia;

    // contructor

    public Sintonizador() {
        frecuencia=80;
    }

    public Sintonizador (double frecuencia) {
        /*if (frecuencia<80) {
            frecuencia=180;
        } else if (frecuencia>180) {
            frecuencia=80;
        }*/
        frecuencia=rango(frecuencia);
        this.frecuencia=frecuencia;

    }

    // Metodo

    public void up() {
        frecuencia+=0.5;
        /*if (frecuencia>180) {
            frecuencia=80;
        }*/
        frecuencia=rango(frecuencia);
    }

    public void down() {
        frecuencia-=0.5;
        /*if (frecuencia<80) {
            frecuencia=180;
        }*/
        frecuencia=rango(frecuencia);
    }

    public void display() {
        System.out.println("La frecuencia actual es de " + frecuencia);
    }

    public double rango(double rango) {
        if (rango<80) {
            rango=180;
        } else if (rango>180) {
            rango=80;
        }

        return rango;
    }

}
