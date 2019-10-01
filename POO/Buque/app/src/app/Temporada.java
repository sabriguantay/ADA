package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {
    public int numeroTemporada;
    public List<Episodio> episodios = new ArrayList<Episodio>();
    

    public Episodio getEpisodio(int nro)
    {
        
        for (Episodio epi : this.episodios) {
            if(epi.nroEpisodio == nro)
            {
                return epi;
            }
            
        }

        return null;
    }

    public Episodio getnombreEpisodio (String nombre){
        for (Episodio epi : this.episodios) {
            if (epi.titulo.equals(nombre)){
                return epi;

            }
            
        }
        return null;
    }

    public Websodio getWebsodio(String nombre){
        for (Episodio websodio : this.episodios) {
            if (websodio.titulo.equals(nombre)) {
                return websodio;

            }

    }




}
}