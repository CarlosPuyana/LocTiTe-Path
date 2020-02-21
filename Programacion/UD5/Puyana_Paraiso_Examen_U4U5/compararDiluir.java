package U5.Examen;

import java.util.Comparator;

public class compararDiluir implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Minecraft) o1).capDiluirse - ((Minecraft) o2).capDiluirse;
    }
}
