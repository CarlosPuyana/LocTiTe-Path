package U5.Tarea1.Ej4;

public class principal {
    public static void main(String[] args) {
        HoraExacta hora1 = new HoraExacta(12, 54, 45);
        HoraExacta hora2 = new HoraExacta(12, 34, 12);
        HoraExacta hora3 = new HoraExacta(12, 54, 45);

        System.out.println(hora1.equals(hora2));
        System.out.println(hora1.equals(hora3));

    }
}
