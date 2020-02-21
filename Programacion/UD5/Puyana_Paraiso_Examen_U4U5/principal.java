package U5.Examen;
import U5.Examen.Cristal.tipo.*;

import static U5.Examen.Cristal.tipo.TRANSLUCIDO;

public class principal {
    public static void main(String[] args) {
        Materiales [] m1 = new Minecraft[10];
        Metal metal1 = new Metal("Hierro", true);
        Cristal cristal1 = new Cristal("Opaco Loco", TRANSLUCIDO);
        Roca roca1 = new Roca("Piedra Caliza");

        m1[0] = new Minecraft("Metal", 10, 12, 22,false, metal1);
        m1[1] = new Minecraft("Cristal Palido", 100, 120, 56,false, cristal1);
        m1[2] = new Minecraft("Piedra Caliza", 150, 260, 70, true, roca1);

    }
}
