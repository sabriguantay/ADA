package ar.com.ada.mongo.pooflix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.mongo.pooflix.entities.Pelicula;
import ar.com.ada.mongo.pooflix.entities.Serie;
import ar.com.ada.mongo.pooflix.models.response.*;
import ar.com.ada.mongo.pooflix.services.PooflixService;

@RestController
public class PooflixController {

    @Autowired
    PooflixService pooflixService;

    @PostMapping("api/series")
    public NuevaSerieResponse postRegisterUser(@RequestBody Serie reqSerie) {
        NuevaSerieResponse r = new NuevaSerieResponse();
        

        pooflixService.grabar(reqSerie);

        r.isOk = true;
        r.message = "Te registraste con exito";
        r.id = reqSerie.get_id().toString();
        return r;

    }

    
    @PostMapping("api/peliculas")
    public NuevaPeliculaResponse postRegisterUser(@RequestBody Pelicula reqPelicula) {
        NuevaPeliculaResponse r = new NuevaPeliculaResponse();
        

        pooflixService.grabar(reqPelicula);

        r.isOk = true;
        r.message = "Te registraste con exito";
        r.id = reqPelicula.get_id().toString();
        return r;

    }



    @GetMapping("api/series")
    public ResponseEntity<?> GetSeries() throws Exception {

        List<Serie> series = pooflixService.getCatalogoSeries();
        if (series.size() == 0)
            return (ResponseEntity<?>) ResponseEntity.notFound();

        return ResponseEntity.ok(series);

    }

    @GetMapping("api/peliculas")
    public ResponseEntity<?> GetPeliculas() throws Exception {

        List<Pelicula> peliculas = pooflixService.getCatalogoPeliculas();
        if (peliculas.size() == 0)
            return (ResponseEntity<?>) ResponseEntity.notFound();

        return ResponseEntity.ok(peliculas);

    }

}