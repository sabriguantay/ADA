package ar.com.ada.mongo.pooflix.entities;

/**
 * Contenido
 */
public class Contenido {

    public String nombre;
    public String genero;
    public int anio;

    public Contenido(){
        
    }

    public Contenido (int anio, String nombre, String genero){
        this.anio = anio;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    

}