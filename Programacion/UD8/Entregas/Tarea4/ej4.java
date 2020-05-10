package U8.Tarea4;

public class ej4 {
    private String artista;
    private int duracion;
    private String titulo;

    public ej4(String artista, int duracion, String titulo) {
        this.artista = artista;
        this.duracion = duracion;
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
