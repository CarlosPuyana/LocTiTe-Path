package U4.Tarea1.EJ8;

public class principal {
    public static void main(String[] args) {

        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla(false);
        Bombilla b3 = new Bombilla(true);

        b1.encender();
        b1.isInGeneral(false);
        b3.apagar();

        b1.mostrarInfo();
        b2.mostrarInfo();
        b3.mostrarInfo();
    }
}
