package app;

/**
 * Episodio
 */
public class Episodio {

    public int nroEpisodio;
    public String titulo;
    public int duracion;

    public Episodio(String tit){
        this.titulo = tit;

    }
    

    public void reproducir() {
        System.out.println("Reproduciendo " + this.titulo);

    }
}
