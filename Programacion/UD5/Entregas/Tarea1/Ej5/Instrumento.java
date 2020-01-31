package U5.Tarea1.Ej5;

public abstract class Instrumento {
    public enum Nota { DO, RE, MI, FA, SOL, LA, SI}

    protected Nota notas[];
    protected int numNotas;

    public Instrumento() {
        notas = new Nota[100];
        numNotas=0;
    }

    public void add(Nota n) {
        if (numNotas<notas.length) {
            notas[numNotas] = n;
            numNotas++;
        }
    }

    public abstract void interpretar();

    }

