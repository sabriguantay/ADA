package ar.com.ada.mongo.pooflix.entities;

/**
 * Episodio
 */
public class Episodio {

    public int nroEpisodio;
    public String titulo;
    public int duracion;

    public Episodio(String titulo) {
        this.titulo = titulo;
    }


    public void Reproducir() {

        System.out.println("Reproduciendo " + this.titulo);

    }

}