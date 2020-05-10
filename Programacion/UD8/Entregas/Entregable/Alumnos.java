package Ejercicios.U8.Entregable;

import java.util.ArrayList;

public class Alumnos {
    private Integer id;
    private String nombre;
    private String apellidos;
    private int edad;
    private ArrayList<Asignaturas> asignatura;

    public Alumnos(Integer id, String nombre, String apellidos, int edad, ArrayList<String>asignaturas){
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.asignatura=asignatura;
    }
    public ArrayList<Asignaturas> getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(ArrayList<Asignaturas> asignatura) {
        this.asignatura = asignatura;
    }

    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Id: "+id+", nombre: "+nombre+", apellidos: "+apellidos+", edad: "+edad;
    }
}
