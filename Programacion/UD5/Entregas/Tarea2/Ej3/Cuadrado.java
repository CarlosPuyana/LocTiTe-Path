package U5.Tarea2.Ej3;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado (int lados) {
        this.lados=lados;
        contadorPoligono++;
    }

    @Override
    public float getArea() {

        return area= (float) Math.pow(lados, 2);
    }
}
