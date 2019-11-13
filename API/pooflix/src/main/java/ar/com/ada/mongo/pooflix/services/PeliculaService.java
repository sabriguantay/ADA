package ar.com.ada.mongo.pooflix.services;

import java.util.HashMap;
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


    public enum PeliculaValidationType {

        PELICULA_OK,
        PELICULA_NULA, 
        PELICULA_VACIA, 
        PELICULA_DUPLICADA, 
        PELICULA_INVALIDA,
        PELICULA_DATOS_INVALIDOS 
        
    }

    public PeliculaValidationType verificarPelicula(Pelicula pelicula) {

        if (pelicula.getNombre() == null)
            return PeliculaValidationType.PELICULA_OK;

        if (pelicula.getAnio() <= 0)
            return PeliculaValidationType.PELICULA_DATOS_INVALIDOS;

        if (pelicula.getGenero() == null)
            return PeliculaValidationType.PELICULA_NULA;

        //Armo un hashmap para ver si la temporada esta duplicada
        HashMap<String, Pelicula> unicaPelicula = new HashMap<>();

        for (Pelicula p : pelicula.getNombre()) {
            if (unicaPelicula.containsKey(new String(p.getNombre()))
                return PeliculaValidationType.PELICULA_DUPLICADA;
            if (p.getNombre.size() == null)
                return PeliculaValidationType.PELICULA_INVALIDA;
        
        unicaPelicula.put(new Integer(p.getAnio()), p);
        
            }

        return PeliculaValidationType.PELICULA_OK;
    }
    
}