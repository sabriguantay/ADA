package ar.com.ada.mongo.pooflix.entities;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Series")
public class Serie extends Contenido {

    @Id
    private ObjectId _id;

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
    


    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
}