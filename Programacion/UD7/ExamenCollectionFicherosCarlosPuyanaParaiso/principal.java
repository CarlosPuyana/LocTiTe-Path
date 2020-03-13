package U6.ExamenCollectionFicheros;

public class principal {
    public static void main(String[] args) {

        Medico m1 = new Medico("Carlos", "Puyana", 12345, "Virgen de Macarena");
        Medico m2 = new Medico("Mariano", "Rajoy", 12347, "Virgen de Rocio");
        Medico m3 = new Medico("Carlos", "Puyana", 12348, "Virgen de Eustaquia");

        Paciente p1 = new Paciente("Pedro Sanchez",34, 102,false,m2,"Agresiva Mortifera");
        Paciente p2 = new Paciente("Felipe VI",52, 74,false,m1,"Agresiva Mortifera Letal sin vacuna");
        Paciente p3 = new Paciente("Reina Letizia",51, 174,false,m1,"Agresiva Mortifera Letal sin vacuna");
        Paciente p4 = new Paciente("Princesa Leonor",12, 34,false,m3,"Agresiva Mortifera Letal sin vacuna");
        Paciente p5 = new Paciente("Infanta Sofia",12, 34,false,m2,"Agresiva Mortifera Letal sin vacuna");
        Paciente p6 = new Paciente("ExRey Juan Carlos",92, 102,false,m3,"Agresiva Mortifera Letal sin vacuna");
        Paciente p7 = new Paciente("ExReina Sofia",87, 104,false,m2,"Agresiva Mortifera Letal sin vacuna");
        Paciente p8 = new Paciente("Pablo Iglesias",51, 84,true,m1,"Graciosa");
        Paciente p9 = new Paciente("Stalin",134, 84,true,m1,"Inofensiva Comunista");
        Paciente p10 = new Paciente("Kim Jong Un",36, 98,false,m1,"Cepa Nuclear");

        CoronaVirus coronao = new CoronaVirus("COVID-19","Wuhan");

        coronao.guardarPacientes();
        coronao.addPaciente("Graciosa", p1);

        coronao.pacientesPorPeso("Agresiva Mortifera Letal sin vacuna");
        coronao.pacientesPorEdad("Agresiva Mortifera Letal sin vacuna");

        coronao.darAltaPaciente(p8);
        coronao.pacientesDeUnDoctor(12345);


    }
}
