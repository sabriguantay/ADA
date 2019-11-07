package ar.com.ada.challenge.nasa.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.challenge.nasa.entities.*;
import ar.com.ada.challenge.nasa.repositories.TemperaturaRepository;

/**
 * TemperaturaService
 */
@Service
public class TemperaturaService {

    @Autowired
    TemperaturaRepository repo;
    @Autowired
    PaisService paisService;
    
    public Temperatura save(Temperatura t) {
        return repo.save(t);
        
    }

    public int crearTemperatura(int codigoPais, int anio, int grado)
    {
        Temperatura t = new Temperatura();
        t.setAnio(anio);
        t.setGrado(grado);
        Pais p = paisService.buscarPorCodigoPais(codigoPais);
        t.setPais(p);

        repo.save(t);
        return t.getTemperaturaId();
    }

    public Temperatura buscarPorId(int id)
    {
        Optional<Temperatura> t = repo.findById(id);

        if (t.isPresent()) {
            return t.get();
        }
        return null;
    }

    public List<Temperatura> buscarPorAnio(int anio)
    {
        for (Temperatura t : repo.findAll()) {
            if (t.getAnio() == anio){
                List<Temperatura> temperaturas = new ArrayList<Temperatura>();
                temperaturas.add(t);
                return temperaturas;
            }
        }
        return null;
    }

    

    public void bajaTemperatura(int id)
    {
        Temperatura t = buscarPorId(id);
        t.setAnio(0);

        repo.save(t);
    }

}