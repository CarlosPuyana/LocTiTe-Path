package U5.Tarea1.Ej3;

public class principal {
    public static void main(String[] args) {
        HoraExacta prueba = new HoraExacta(12, 34, 45);

        prueba.setSegundos(12);
        prueba.inc();
        System.out.println(prueba);

    }
}
