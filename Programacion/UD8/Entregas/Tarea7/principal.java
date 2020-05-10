package Ejercicios.Tarea7;

import Ejercicios.Tarea6.Futbolista;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class principal {
  public static void main(String[] args) {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    Central service = retrofit.create(Central.class);
    Futbolista futbolista = null;
    final Integer futId = 2;

    System.out.println("Obtenemos el listado completo de futbolistas");

    try {
      Response<List<Futbolista>> response = service.listFutbolista().execute();
      if (response.isSuccessful()) {
        List<Futbolista> futbolistas = response.body();
        System.out.println(futbolistas);
      } else {
        System.out.println("Peticion no valida : " + response.message());
      }
    } catch (IOException e) {
      System.out.println("Error en la peticion: " + e.getMessage());
    }

  }
}
