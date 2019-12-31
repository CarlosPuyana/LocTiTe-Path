package U4.Tarea1.EJ6;

public class principal {
    public static void main(String[] args) {
        Banco b1 = new Banco("BBVA", "Bilbao");
        Banco b2 = new Banco("CAIXA", "Barcelona");
        cuentaCorriente c1 = new cuentaCorriente("Marta", "53343849H", b1);
        cuentaCorriente c2 = new cuentaCorriente("Carlos", "17452732P");

        c1.ingresarDinero(100);
        c1.mostrarInformacion();

        System.out.println();	//SALTO DE LINEA

        if (c1.sacarDinero(60)) {
            System.out.println("Operación realizada exitosamente.");
        } else {
            System.out.println("NO SE HA PODIDO SACAR EL DINERO.");
        }
        if (c1.sacarDinero(95)) {
            System.out.println("Operación realizada exitosamente.");
        } else {
            System.out.println("NO SE HA PODIDO SACAR EL DINERO.");
        }

        System.out.println();	//SALTO DE LINEA

        c1.cambiarNombreB(b2);
        c1.mostrarInformacion();

        System.out.println("\n"); //DOBLE SALTO DE LINEA

        c2.mostrarInformacion();
        c2.cambiarNombreB(b2);
        c2.mostrarInformacion();

    }
}
