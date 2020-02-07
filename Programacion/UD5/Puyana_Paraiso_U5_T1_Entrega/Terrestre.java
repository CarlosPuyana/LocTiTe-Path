package U5.Entrega;

public abstract class Terrestre extends Vehiculos implements Comparable{

    protected String Matricula;
    protected int anoFabricacion;
    public enum color { AZUL, AMARILLO, ROJO, VERDE }
    color color;

    @Override
    public int compareTo(Object o) {
        return Matricula.compareTo(((Terrestre) o).Matricula);
    }

}
