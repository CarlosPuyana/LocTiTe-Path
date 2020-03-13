package U6.ExamenCollectionFicheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class CoronaVirus {
    String nombreCientifico="COVID-19";
    String Origen="Wuhan";

    private Map<String, Set<Paciente>> pacientes;

    //Contructor Manny Paquiao
    public CoronaVirus(String nombreCientifico, String origen) {
        this.nombreCientifico = nombreCientifico;
        Origen = origen;
        pacientes = new HashMap<>();
    }
    // Getters & Setters
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    public String getOrigen() {
        return Origen;
    }
    public void setOrigen(String origen) {
        Origen = origen;
    }
    public Map<String, Set<Paciente>> getPacientes() {
        return pacientes;
    }
    public void setPacientes(Map<String, Set<Paciente>> pacientes) {
        this.pacientes = pacientes;
    }


    //Metodos
    public void addPaciente(String cepa, Paciente paciente) {
        if (paciente.getCepa().equals(cepa)) {
            if (!pacientes.containsKey(cepa)) {
                pacientes.put(cepa, new TreeSet<Paciente>());
            }
            pacientes.get(cepa).add(paciente);
        } else {
            System.out.println("Ese paciente no esta infectado por tal cepa");
        }
    }
    public boolean darAltaPaciente(Paciente paciente) {
        if (!pacientes.containsKey(paciente.getCepa())) {
            System.out.println("No se ha encontrado el paciente");
            return false;
        } else {
            if (pacientes.get(paciente.getCepa()).contains(paciente)) {
                return pacientes.get(paciente.getCepa()).remove(paciente);
            } else {
                System.out.println("No se ha encontrado el paciente en la lista de infectados por tal cepa");
                return false;
            }
        }
    }
    public void pacientesDeUnDoctor(int numColegiado) {
        Collection<Set<Paciente>> conjunto = pacientes.values();
        int numpacientes = 0;

        Iterator it = conjunto.iterator();

        while (it.hasNext()) {
            Set<Paciente> pac = (Set<Paciente>) it.next();

            for (Paciente p : pac) {
                if (p.getMedico().getNum_colegiado() == numColegiado) {
                    System.out.println(p);
                    numpacientes++;
                }
            }
        }
        if (numpacientes==0) {
            System.out.println("Este médico/a no lleva ningún paciente");
        }
    }

    public void pacientesPorPeso(String cepa) {
        if (!pacientes.containsKey(cepa)) {
            System.out.println("No hay pacientes inscritos con esa cepa");
        } else {
            System.out.println(pacientes.get(cepa));
        }
    }

    public void pacientesPorEdad(String cepa) {
        if (!pacientes.containsKey(cepa)) {
            System.out.println("No hay pacientes inscritos con esa cepa");
        } else {
            List<Paciente> lista = new ArrayList<>(pacientes.get(cepa));

            /*Collections.sort(lista, new Comparator<Paciente>() {
                @Override
                public int compare(Paciente paciente, Paciente Yaki) {
                    return Yaki.getEdad()-paciente.getEdad();
                }
            });*/
            Collections.sort(lista, (paciente, Yaki) -> Yaki.getEdad()-paciente.getEdad());

            System.out.println(lista);
        }
    }

    public void cargarPacientes() {
        try {
            ObjectInputStream puyi = new ObjectInputStream(new FileInputStream("src/U6/ExamenCollectionFicheros/pacientes.dat"));

            while (true) {
                Paciente p = (Paciente) puyi.readObject();
                addPaciente(p.getCepa(),p);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void guardarPacientes() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/U6/ExamenCollectionFicheros/pacientes.dat"));
            Collection<Set<Paciente>> conjunto = pacientes.values();

            Iterator it = conjunto.iterator();

            while (it.hasNext()) {
                Set<Paciente> pacs = (Set<Paciente>) it.next();

                for (Paciente p : pacs) {
                    oos.writeObject(p);
                }
            }

            oos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
