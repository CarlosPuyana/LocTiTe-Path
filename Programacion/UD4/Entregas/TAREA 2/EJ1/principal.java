package U4.Tarea2.EJ1;

public class principal {
    public static void main(String[] args) {
        Lista lalista = new Lista();
        lalista.insertarFinal(3);
        lalista.insertarFinal(2);
        lalista.insertarFinal(1);
        lalista.insertarFinal(4);
        lalista.insertarFinal(5);
        System.out.println(lalista.mostrar());

        lalista.insertarPrincipio(0);
        lalista.insertarPrincipio(1);
        lalista.insertarPrincipio(2);
        lalista.insertarPrincipio(3);
        lalista.insertarPrincipio(4);
        System.out.println(lalista.mostrar());

        lalista.insertar(2,10);
        System.out.println(lalista.mostrar());
        lalista.eliminar(2);
        System.out.println(lalista.mostrar());
    }
}
