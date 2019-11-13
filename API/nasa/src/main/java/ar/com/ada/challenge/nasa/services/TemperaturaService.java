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

    public int crearTemperatura(int codigoPais, int anio, int grado) {
        Temperatura t = new Temperatura();
        t.setAnio(anio);
        t.setGrado(grado);
        Pais p = paisService.buscarPorCodigoPais(codigoPais);
        t.setPais(p);

        repo.save(t);
        return t.getTemperaturaId();
    }

    public Temperatura buscarPorId(int id) {
        Optional<Temperatura> t = repo.findById(id);

        if (t.isPresent()) {
            return t.get();
        }
        return null;
    }

    public List<Temperatura> buscarPorAnio(int anio) {
        for (Temperatura t : repo.findAll()) {
            if (t.getAnio() == anio) {
                List<Temperatura> temperaturas = new ArrayList<Temperatura>();
                temperaturas.add(t);
                return temperaturas;
            }
        }
        return null;
    }

    public void bajaTemperatura(int id) {
        Temperatura t = buscarPorId(id);
        t.setAnio(0);

        repo.save(t);
    }

    public enum TemperaturaValidationType {

        TEMPERATURA_OK, TEMPERATURA_NULA, TEMPERATURA_VACIA, TEMPERATURA_DUPLICADA, TEMPERATURA_INVALIDA,
        TEMPERATURA_DATOS_INVALIDOS,

    }

    public TemperaturaValidationType verificarTemperatura(Temperatura t) {

        if (t.getAnio() <= 0)
            return TemperaturaValidationType.TEMPERATURA_DATOS_INVALIDOS;

        if (t.getGrado() == null)
            return TemperaturaValidationType.TEMPERATURA_NULA;

        if (t.getAnio().size() == 0)
            return TemperaturaValidationType.TEMPERATURA_VACIA;

        // Armo un hashmap para ver si la temporada esta duplicada
        HashMap<Integer, Temperatura> unicasTemps = new HashMap<>();

        for (Temperatura t : temperatura.getTemporadas()) {
            if (unicasTemps.containsKey(new Integer(p.getNumeroTemporada())))
                return TemperaturaValidationType.TEMPERATURA_DUPLICADA;
            if (t.getEpisodios().size() == 0)
                return TemperaturaValidationType.TEMPERATURA_INVALIDA;

            unicasTemps.put(new Integer(t.getNumeroTemporada()), t);

        }

        return TemperaturaValidationType.TEMPERATURA_OK;
    }

}