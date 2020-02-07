package U5.Entrega;

import java.lang.reflect.Array;
import java.util.Arrays;

import static U5.Entrega.Terrestre.color.*;

public class principal {

    public static void main(String[] args) {
        Vehiculos [] v1 = new Moto[3];
        Vehiculos [] v2 = new Coches[3];
        Vehiculos [] v3 = new Helicoptero[1];
        Vehiculos [] v4 = new Avioneta[1];

        v1 [0] = new Moto("LaKaSiTo", "123P", 1998, 1, AMARILLO);
        v1 [1] = new Moto("C0nGu1T0", "123H", 1998, 2, ROJO);
        v1 [2] = new Moto("Huevo K1ND3R", "123T", 1999, 1, VERDE);

        v2 [0] = new Coches("Ford Mustache", "1234G", 2012, 2, AZUL);
        v2 [1] = new Coches("Geraldo De Revilla", "1234A", 2002, 3, AZUL);
        v2 [2] = new Coches("Karlitos King", "1234V", 2012, 5, AZUL);

        Vehiculos h1 = new Helicoptero("La Mamba", "UP-011J", 1200, 0);
        Vehiculos a1 = new Avioneta("Pablito Escobar", "UP-012J", 1200, 12);

        Arrays.sort(v1);    Arrays.sort(v2);

        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));

        Arrays.sort(v1, new comparaAno());
        Arrays.sort(v2, new comparaAno());
        System.out.println("Ordenado por Año Fabricacion: " + Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));

        System.out.println(h1.toString());
        System.out.println("Añadimos 9 personas al helicoptero de Kobey");
        h1.transportar(9);
        System.out.println(h1.toString());

    }
}
