package U5.Tarea2.Ej2;

import java.util.Comparator;

public class compararNombres implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Cliente) o1).nombre.compareTo(((Cliente) o2).nombre);
    }
}
