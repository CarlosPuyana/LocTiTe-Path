package U4.Entregable;

public class Principal {
    public static void main(String[] args) {
        Pizza uno = new Pizza(Pizza.size.MEDIANA, 1);


        System.out.println(uno.mostrarTamanos());

        uno.setIngredientes(1);
    }
}
