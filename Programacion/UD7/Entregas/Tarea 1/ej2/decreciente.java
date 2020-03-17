package U7.Tarea1.ej2;

import java.util.Comparator;

public class decreciente implements Comparator <Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
