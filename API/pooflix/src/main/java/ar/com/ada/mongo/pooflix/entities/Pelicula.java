package ar.com.ada.mongo.pooflix.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Peliculas")
public class Pelicula extends Contenido {
public boolean ganoOscar;

    
}