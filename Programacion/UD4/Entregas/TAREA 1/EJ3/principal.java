package U4.Tarea1.EJ3;

public class principal {
    public static void main(String[] args) {
        cuentaCorriente c1 = new cuentaCorriente("Carlos", "123456A");


        String nombre = c1.nombre; // Visible para todos
        String dni = c1.dni; // Visible para clases vecinas
        //double saldo = c1.saldo;  No visible

    }
}
