package ar.com.ada.mongo.pooflix.entities;

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

    public Episodio getNroEpisodio(int numero) {
        for (Episodio e : this.episodios) {
            if (numero == e.nroEpisodio)
                return e;

        }
        return null;
    }

    public Episodio getNroEpisodio(String nombre) {
        for (Episodio n : this.episodios) {
            if (nombre.equals(n.titulo)) {
                return n;

            }
        }
        return null;
    }
   



    public Episodio getEpisodio(int nro) {
        // Recorrer cada episodio
        // Si el nro de episodio del ciclo es igual a "nro"
        // Devolver esa episodio

        for (Episodio epi : this.episodios) {
            if (epi.getNroEpisodio() == nro) {
                return epi;
            }

        }

        return null;
    }


    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }

    public int getNroTemporada() {
        return nroTemporada;
    }

    public void setNroTemporada(int nroTemporada) {
        this.nroTemporada = nroTemporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


}


