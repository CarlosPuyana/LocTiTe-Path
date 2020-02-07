package U5.Entrega;

import java.util.Comparator;

public class comparaAno implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Terrestre) o1).anoFabricacion - ((Terrestre) o2).anoFabricacion;
    }
}
