package ar.com.ada.challenge.nasa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.challenge.nasa.entities.Pais;
import ar.com.ada.challenge.nasa.entities.Temperatura;
import ar.com.ada.challenge.nasa.models.requests.*;
import ar.com.ada.challenge.nasa.models.responses.*;
import ar.com.ada.challenge.nasa.services.PaisService;
import ar.com.ada.challenge.nasa.services.TemperaturaService;

/**
 * TemperaturaController
 */
@RestController
public class TemperaturaController {

    @Autowired
    TemperaturaService temperaturaService;
    @Autowired
    PaisService paisService;

    @PostMapping("/temperaturas")
    public TemperaturaResponse postCreateTemperatura(@RequestBody TemperaturaCrearRequest req) {
        TemperaturaResponse r = new TemperaturaResponse();
        int temperaturaCreadaId = temperaturaService.crearTemperatura(req.codigoPais, req.anio, req.grado);

        r.temperaturaId = temperaturaCreadaId;
        return r;
    }

    @GetMapping("/temperaturas/paises/{codigoPais}")
    public List<Temperatura> getTemperaturaPorId(@PathVariable int codigoPais) {
        Pais p = paisService.buscarPorCodigoPais(codigoPais);
        return p.getTemperaturas();
        
    }


    @DeleteMapping("/temperaturas/{id}")
    public TemperaturaEliminarResponse deleteTemperatura(@PathVariable int id)
    {
        TemperaturaEliminarResponse r = new TemperaturaEliminarResponse();
        temperaturaService.bajaTemperatura(id);

        r.isOk = true;
        r.message = "Temperatura eliminada";
        return r;
    }

    @GetMapping("/temperaturas/anios/{anio}")
    public List<Temperatura> getTemperaturaPorAnio(@PathVariable int anio) {
        return temperaturaService.buscarPorAnio(anio);        
    }


}