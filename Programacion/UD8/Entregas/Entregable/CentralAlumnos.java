package Ejercicios.U8.Entregable;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface CentralAlumnos {
    @GET("json_api_demo/alumnos")
      Call<List<Alumnos>> listAlumnos();

        @GET ("json_api_demo/alumnos/{alumnoId}")
        Call<Alumnos> getalumnoId(@Path("alumnoId")Integer alumnoId);


    @GET("json_api_demo/asignaturas")
    Call<List<Asignaturas>>listAlumnosasignaturas(@Path("alumnoId")Integer alumnoId);
}
