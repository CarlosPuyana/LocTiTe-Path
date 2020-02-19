package U5.Tarea2.Ej2;

import java.util.Comparator;

public class compararEdad implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Cliente) o1).edad - ((Cliente) o2).edad;
    }
}
