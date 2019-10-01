package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {

    public int nroTemporada;
    public List<Episodio> episodios = new ArrayList<Episodio>();
    public String nombre;
    public int anio;

    public Temporada (String nombre){
        this.nombre= nombre;
    }
    public Temporada(){

    }

    public Episodio getNumeroEpisodio(int numero) {
        for (Episodio e : this.episodios) {
            if (numero == e.nroEpisodio)
                return e;

        }
        return null;
    }

    public Episodio getNombreEpisodio(String nombre) {
        for (Episodio n : this.episodios) {
            if (nombre.equals(n.titulo)) {
                return n;

            }
        }
        return null;
    }
    public Episodio getEpisodio(int numero) {

        for (Episodio e : this.episodios) {
            if (numero == e.nroEpisodio)
                return e;

        }
        return null;

    }

}