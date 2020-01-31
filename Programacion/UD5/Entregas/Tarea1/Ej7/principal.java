package U5.Tarea1.Ej7;

import static U5.Tarea1.Ej7.Caja.Unidades.CM;
import static U5.Tarea1.Ej7.Caja.Unidades.M;

public class principal {
    public static void main(String[] args) {
        Caja caja1 = new Caja(12, 13,14, CM);
        Caja caja2 = new Caja(13,14,15, M);

        System.out.println(caja1);
        caja1.etiqueta="Prueba";
        System.out.println(caja2);
        System.out.println(caja1.etiqueta);
    }
}
