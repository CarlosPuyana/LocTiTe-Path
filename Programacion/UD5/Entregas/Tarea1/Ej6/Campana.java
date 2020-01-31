package U5.Tarea1.Ej6;

import U5.Tarea1.Ej5.Instrumento;

public class Campana extends Instrumento {

    //Constructor
    public Campana() {
        super();
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < numNotas; i++) {
            switch (notas[i]) {
                case DO:
                    System.out.println("DOOOON");
                    break;
                case RE:
                    System.out.println("REEEEEEEN");
                    break;
                case MI:
                    System.out.println("MIIIIIIN");
                    break;
                case FA:
                    System.out.println("FAAAAAAAAAN");
                    break;
                case SOL:
                    System.out.println("SOOOOOOOOON");
                    break;
                case LA:
                    System.out.println("LAAAAAAAN");
                    break;
                case SI:
                    System.out.println("SIIIIIN");
                    break;
            }
        }
    }
}
