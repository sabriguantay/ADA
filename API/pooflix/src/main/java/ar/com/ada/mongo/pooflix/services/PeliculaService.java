package ar.com.ada.mongo.pooflix.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.mongo.pooflix.entities.*;
import ar.com.ada.mongo.pooflix.repo.*;

/**
 * SerieService
 */
@Service
public class PeliculaService {

    @Autowired
    PeliculaRepository repo;

    public void grabar(Pelicula pelicula) {
        repo.save(pelicula);
    }

    public Pelicula buscarPorId(ObjectId id) {
        return repo.findBy_id(id);
    }

    public Pelicula buscarPorNombre(String nombre) {
        return repo.findByNombre(nombre);
    }

    public List<Pelicula> getCatalogo() {
        return repo.findAll();
    }
    
}