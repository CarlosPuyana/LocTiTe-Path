package U4.Tarea1.EJ7;

public class principal {
    public static void main(String[] args) {
        Sintonizador Revoltosa = new Sintonizador();
        Sintonizador cuarentas = new Sintonizador(12.3);

        Revoltosa.up();
        //Revoltosa.down();Revoltosa.down();
        Revoltosa.display();
        cuarentas.display ();

    }
}
