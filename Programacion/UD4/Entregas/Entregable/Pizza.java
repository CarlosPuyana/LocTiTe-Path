package U4.Entregable;


import java.util.Arrays;

public class Pizza {

    private final size tamano;

    public enum size { MEDIANA, FAMILIAR};

    static final int ING_Queso = 1;
    static final int ING_Pollo = 2;
    static final int ING_Bacon = 3;
    protected String[] ingredientes =  {" ", "Queso", "Pollo", "Bacon"};

    public int numIngredientes;
    private boolean ingCorrectos;
    private boolean anadirIngrediente;

    private int ing1;
    private int ing2;
    private int ing3;

    private String ingre1;
    private String ingre2;
    private String ingre3;

    //Constructor
    public Pizza(size tamano, int ingrediente1) {
        this.tamano=tamano;
        if (ingrediente1 < 4 && ingrediente1 > -1) {
            this.ingCorrectos = true;
            this.ing1 = ingrediente1;
            this.numIngredientes = 1;
        }else {
            this.ingCorrectos = false;
        }
    }
    public Pizza(size tamano, int ingrediente1, int ingrediente2) {
        this.tamano=tamano;
        if (ingrediente1 < 4 && ingrediente1 > -1) {
            this.ingCorrectos = true;
            this.ing1 = ingrediente1;
            this.ing2 = ingrediente2;
            this.numIngredientes = 2;
        } else {
            this.ingCorrectos = false;
        }
    }
    public Pizza(size tamano, int ingrediente1, int ingrediente2, int ingrediente3) {
        this.tamano=tamano;
        if (ingrediente1 < 4 && ingrediente1 > -1) {
            this.ingCorrectos = true;
            this.ing1 = ingrediente1;
            this.ing2 = ingrediente2;
            this.ing3 = ingrediente3;
            this.numIngredientes = 3;
        } else {
            this.ingCorrectos = false;
        }
    }

    void setIngredientes(int ingrediente) {
        if (numIngredientes<3) {
            anadirIngrediente=true;
            if (numIngredientes==1) {
                this.ing2=ingrediente;
            } else if (numIngredientes==2) {
                this.ing3=ingrediente;
            }
        numIngredientes++;
        }

    }


    String mostrarTamanos() {
        return "Los tamaños disponibles de pizzas son: " + Arrays.toString(size.values());
    }


}
