package U6.ExamenCollectionFicheros;

import java.io.Serializable;

public class Medico implements Serializable {
    private String nombre, apellidos;
    private int num_colegiado;
    private String hospital;

    //Contructor Manny Manitas
    public Medico(String nombre, String apellidos, int num_colegiado, String hospital) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_colegiado = num_colegiado;
        this.hospital = hospital;
    }
    //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getNum_colegiado() {
        return num_colegiado;
    }

    public String getHospital() {
        return hospital;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNum_colegiado(int num_colegiado) {
        this.num_colegiado = num_colegiado;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    //Muestramelotodopapi
    @Override
    public String toString() {
        return "Medico: \n Nombre: " + nombre + "\n Apellidos: " + apellidos + "\n Número de colegiado: " + num_colegiado
                + "\n Hospital: " + hospital;
    }
}
