package ar.com.ada.challenge.nasa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.challenge.nasa.entities.Pais;
import ar.com.ada.challenge.nasa.models.requests.*;
import ar.com.ada.challenge.nasa.models.responses.PaisResponse;
import ar.com.ada.challenge.nasa.services.PaisService;

/**
 * PaisController
 */
@RestController
public class PaisController {

    @Autowired
    PaisService paisService;

    @PostMapping("/paises")
    public PaisResponse postCreatePais(@RequestBody PaisCrearRequest req)
    {
        PaisResponse r = new PaisResponse();
        paisService.crearPais(req.codigoPais, req.nombre);

        r.isOk = true;
        r.message = "Pais creado con exito";
        return r;
    }

    @GetMapping("/paises")
    public List<Pais> GetPaises() {
        List<Pais> lp = paisService.getPaises();

        return lp;
    }

    @GetMapping("/paises/{id}")
    public ResponseEntity<Pais> getCategoriaPorId(@PathVariable int id){
        Pais p = paisService.buscarPorId(id);
        if (p == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(p);
    }

    @PutMapping("/paises/{id}") 
    public PaisResponse postCreatePais(@PathVariable int id, @RequestBody PaisModificarRequest req)
    {
        PaisResponse pr = new PaisResponse();
        paisService.actualizarPais(req.paisId, req.nombre);

        pr.isOk = true;
        pr.message = "Pais modificado con exito";
        return pr;
    }

}