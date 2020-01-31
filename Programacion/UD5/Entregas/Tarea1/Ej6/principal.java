package U5.Tarea1.Ej6;

import U5.Tarea1.Ej5.Instrumento;

public class principal {
    public static void main(String[] args) {
        Campana c = new Campana();
        Piano p = new Piano();
        c.add(Instrumento.Nota.DO);
        c.add(Instrumento.Nota.RE);
        p.add(Instrumento.Nota.MI);
        p.add(Instrumento.Nota.FA);
        c.interpretar();
        p.interpretar();
    }
}
