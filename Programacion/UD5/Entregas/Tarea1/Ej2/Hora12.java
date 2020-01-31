package U5.Tarea1.Ej2;

import U5.Tarea1.Ej1.Hora;

public class Hora12 extends Hora {
    protected String meridiano="";

    //Constructor
    public Hora12(int hora, int minutos) {
        super(hora, minutos);
        if (this.hora < 13) {
            meridiano="AM";
        } else {
            this.hora=this.hora-12;
            meridiano="PM";
        }
    }

    //Metodos

    @Override
    public String toString(){
        return (super.toString()+ " " + meridiano);
    }
}
