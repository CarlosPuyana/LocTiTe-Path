package U6.ExamenCollectionFicheros;

import java.io.Serializable;

public class Paciente implements Comparable, Serializable {
    private String nombrePaciente;
    private int edad, peso;
    private boolean vacunas;
    private Medico medico;
    private String cepa;

    //Contructor de Monumentos
    public Paciente(String nombrePaciente, int edad, int peso, boolean vacunas, Medico medico, String cepa) {
        this.nombrePaciente = nombrePaciente;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.medico = medico;
        this.cepa = cepa;
    }
    //Setters & Getters
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getCepa() {
        return cepa;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setCepa(String cepa) {
        this.cepa = cepa;
    }

    @Override
    public int compareTo(Object o) {
        Paciente p = (Paciente) o;
        return p.getPeso()-getPeso();
    }
}
