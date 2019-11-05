package ar.com.ada.mongo.pooflix.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Peliculas")
public class Pelicula extends Contenido {
public boolean ganoOscar;

@Id
private ObjectId _id;

public Object get_id() {
    return null;
}

}