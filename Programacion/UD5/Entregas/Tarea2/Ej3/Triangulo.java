package U5.Tarea2.Ej3;

public class Triangulo extends PoligonoRegular {
    protected float altura;

    /*public Triangulo (int lados, int altura, color color) {
        this.lados=lados;
        this.altura=altura;
        contadorPoligono++;
    }*/
    public Triangulo() {
        lados=10;
        altura=10;
       // color= PoligonoRegular.color.azul;
    }

    @Override
    public float getArea() {
        return area=lados*altura;
    }
}
