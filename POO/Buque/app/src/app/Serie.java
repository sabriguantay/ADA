package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Serie
 */
public class Serie extends Contenido {

    public int nroTemporada;

    public List<Temporada> temporadas = new ArrayList<Temporada>();;

    public Temporada getTemporada(int nro) {
        for (Temporada tempo : this.temporadas) {
            if (tempo.numeroTemporada == nro) {
                return tempo;
            }

        }
        return null;
    }
}