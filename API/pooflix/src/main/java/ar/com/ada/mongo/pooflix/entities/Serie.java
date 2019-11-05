package ar.com.ada.mongo.pooflix.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Series")
public class Serie extends Contenido {

    public List<Temporada> temporadas = new ArrayList<Temporada>();

    public Temporada getTemporada(int numero) {

        // Recorrer cada temporada si el numero de temporada
        // del ciclo es igual a "numero"
        // devolver esa temporada

        for (Temporada t : this.temporadas) { // variable t de tipo Temporada

            if (numero == t.nroTemporada)
                return t;
        }
        return null;
    }

	public Object get_id() {
		return null;
	}

}