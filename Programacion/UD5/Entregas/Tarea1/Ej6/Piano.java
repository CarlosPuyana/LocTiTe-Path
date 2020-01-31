package U5.Tarea1.Ej6;

import U5.Tarea1.Ej5.Instrumento;

public class Piano extends Instrumento {

    //Constructor
    public Piano() {
        super();
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < numNotas; i++) {
            switch (notas[i]) {
                case DO:
                    System.out.println("DOOOO");
                    break;
                case RE:
                    System.out.println("REEEEEEE");
                    break;
                case MI:
                    System.out.println("MIIIIII");
                    break;
                case FA:
                    System.out.println("FAAAAAAAAA");
                    break;
                case SOL:
                    System.out.println("SOOOOOOOOOL");
                    break;
                case LA:
                    System.out.println("LAAAAAAA");
                    break;
                case SI:
                    System.out.println("SIIIII");
                    break;
            }
        }
    }

}
