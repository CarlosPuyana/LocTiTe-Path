package Ejercicios.U8.Entregable;

import com.google.gson.Gson;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Retrofit {
  public static void main(String[] args) {
      ArrayList<Alumnos> alumno = new ArrayList<Alumnos>();
      Alumnos alumno1 = new Alumnos(1,"Fernando","García",20, new ArrayList<>(Arrays.asList("1,Programación,1","2,Base de datos,1")));
      Alumnos alumno2 = new Alumnos(2,"Manuel","Sánchez",23,new ArrayList<>(Arrays.asList("3,Programación,2","4,Lenguaje de Marcas,2")));

      alumno.add(alumno1);
      alumno.add(alumno2);

      Gson gson = new Gson();

      String cadena;
      System.out.println(cadena = gson.toJson(alumno));

      Retrofit retrofit = new Retrofit.Builder()
              .baseUrl("https://my-json-server.typicode.com/chemaduran/json_entrega1/")
              .addConverterFactory(GsonConverterFactory.create())
              .build();

      CentralAlumnos service = retrofit.create(CentralAlumnos.class);
      Alumnos alumno1=null;
      final Integer alumnoId=2;

    System.out.println("Obtenemos una lista de los alumnos");
    try{
        Response<List<Alumnos>> response = service.listAlumnos().execute();
        if(response.isSuccessful()){
            List<Alumnos> alumnos = response.body();
        System.out.println(alumnos);
        }
    }catch(IOException e){
      System.out.println("Error en la petición " + e.getMessage());
    }

    System.out.println("Obtenemos un alumno concreto identificado por su id, " + alumnoId);
      try{
          Response<Alumnos> response = service.getalumnoId(alumnoId).execute();

          if (response.isSuccessful()){
              alumno1 = response.body();
              System.out.println(alumno1);
          }else{
              System.out.println("Petición no válida: " + response.message());
          }
      }catch(IOException e){
          System.out.println("Error en la petición: " + e.getMessage());
      }

      System.out.println("Obtenemos las asignaturas de un alumno concreto identificado por su id, " + alumnoId);

      try{
          Response<List<Asignaturas>> response = service.listAlumnosasignaturas(alumnoId).execute();

          if (response.isSuccessful()){
              List<Asignaturas> asignaturas = response.body();
              System.out.println(asignaturas);
              if (alumno1!=null){
                  alumno1.setAsignatura(new ArrayList<>(asignaturas));
              }
          }else{
              System.out.println("Petición no válida: " + response.message());
          }
      }catch(IOException e){
          System.out.println("Error en la petición: " + e.getMessage());
      }

    System.out.println();
    System.out.println("Imprimimos el objeto alumno:");
    System.out.println(alumno1);
  }
}
