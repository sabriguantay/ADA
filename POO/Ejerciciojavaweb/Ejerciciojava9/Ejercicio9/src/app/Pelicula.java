package app;

/**
 * Pelicula
 */
public class Pelicula {

    public String título;
    public int duración;
    public int edad_mínima;
    public String director;


    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.título = titulo;
        this.duración = duracion;
        this.edad_mínima = edadMinima;
        this.director = director;
    }
 
    
    public String getTitulo() {
        return título;
    }
 
    public void setTitulo(String titulo) {
        this.título = titulo;
    }
 
    public int getDuracion() {
        return duración;
    }
 
    public void setDuracion(int duracion) {
        this.duración = duracion;
    }
 
    public int getEdadMinima() {
        return edad_mínima;
    }
 
    public void setEdadMinima(int edadMinima) {
        this.edad_mínima = edadMinima;
    }
 
    public String getDirector() {
        return director;
    }
 
    public void setDirector(String director) {
        this.director = director;
    }
 
    
 
}

