package ar.com.ada.mongo.pooflix.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.mongo.pooflix.entities.*;

/**
 * Nefly
 */

@Service
public class PooflixService {

    @Autowired
    SerieService serieService;
    
    @Autowired
    PeliculaService peliculaService;

    public void grabar(Serie serie) {
        serieService.grabar(serie);
    }

    public void grabar(Pelicula pelicula) {
        peliculaService.grabar(pelicula);
    }

    public Serie buscarSerie(String nombre) {
        return serieService.buscarPorNombre(nombre);
    }

    public Serie buscarSerie(ObjectId id) {
        return serieService.buscarPorId(id);
    }

    public List<Serie> getCatalogoSeries() {
        return serieService.getCatalogo();
    }

    public List<Pelicula> getCatalogoPeliculas() {
        return peliculaService.getCatalogo();
    }

}
