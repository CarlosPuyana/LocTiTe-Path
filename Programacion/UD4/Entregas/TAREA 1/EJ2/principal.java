package U4.Tarea1.EJ2;

public class principal {
    public static void main(String[] args) {

        cuentaCorriente c = new cuentaCorriente("Carlos" ,"123456789A");
        cuentaCorriente c2 = new cuentaCorriente(500);
        cuentaCorriente c3 = new cuentaCorriente(200, 5, "123456789A");


        /*c.mostrarInformacion();

        c.ingresarDinero(100);

        if (c.sacarDinero(60)) {
            System.out.println("Se ha retirado dinero desde el principal");
        } else {
            System.out.println("No se ha retirado dinero desde el principal.");
        }

        c.mostrarInformacion();*/

       /* if (c.sacarDinero(95)) {
            System.out.println("Se ha retirado dinero desde el principal");
        } else {
            System.out.println("No se ha retirado dinero desde el principal");
        }*/

        c.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();

    }
}
