package ar.com.ada.challenge.nasa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.challenge.nasa.entities.Pais;
import ar.com.ada.challenge.nasa.repositories.*;

/**
 * PaisService
 */
@Service
public class PaisService {

    @Autowired
    PaisRepository repo;

    public Pais save(Pais p) {
        return repo.save(p);
        
    }

   
    

    public void crearPais(int codigoPais, String nombre)
    {
        Pais p = new Pais();
        p.setCodigoPais(codigoPais);
        p.setNombre(nombre);

        repo.save(p);
    }

    public List<Pais> getPaises() {

        return repo.findAll();
    }

    public Pais buscarPorId(int id)
    {
        Optional<Pais> p = repo.findById(id);

        if (p.isPresent()) {
            return p.get();
        }
        return null;
    }

    public Pais buscarPorCodigoPais(int codigoPais)
    {
        for (Pais p : repo.findAll()) {
            if (p.getCodigoPais() == codigoPais){
                return p;
            }
        }
        return null;
    }


    public void actualizarPais(int paisId, String nombre)
    {
        Pais p = buscarPorId(paisId);
        p.setNombre(nombre);

        repo.save(p);
    }

}