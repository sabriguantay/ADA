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

    public int getNroEpisodio() {
        return nroEpisodio;
    }

    public void setNroEpisodio(int nroEpisodio) {
        this.nroEpisodio = nroEpisodio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Episodio(){
        
    }


	public int size() {
		return 0;
	}
}