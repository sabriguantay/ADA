package ar.com.ada.api.spookify.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.spookify.entities.Cancion;
import ar.com.ada.api.spookify.entities.Genero;

/**
 * CancionController
 */
@RestController
public class CancionController {
    
    @GetMapping(value = "/temas") //
    //@RequestMapping (se indica el tipo) --> otra version

    public List<Cancion> getTodas() {

        List<Cancion> lista = new ArrayList<Cancion>();

        Cancion c = new Cancion();
        c.setTitulo("Zombie");
        c.setDuracion(4.0);
        lista.add(c);

        c = new Cancion();
        c.setTitulo("This is Halloween");
        c.setDuracion(3.5);
        lista.add(c);

        c = new Cancion();
        c.setTitulo("Eclipse");
        c.setDuracion(3.5);
        lista.add(c);

        c = new Cancion();
        c.setTitulo("Firetruck");
        c.setDuracion(3.5);
        lista.add(c);

        return lista;

    }

    @GetMapping (value = "/generos")
    public List<Genero> getTodosGeneros() {

        List<Genero> listaGeneros = new ArrayList<Genero>();

        Genero g = new Genero();
        g.setTipo("Rock");
        listaGeneros.add(g);

        g = new Genero();
        g.setTipo("Pop");
        listaGeneros.add(g);

        g = new Genero();
        g.setTipo("Cumbia");
        listaGeneros.add(g);

        g = new Genero();
        g.setTipo("Jazz");
        listaGeneros.add(g);

        g = new Genero();
        g.setTipo("Cumbia");
        listaGeneros.add(g);

        g = new Genero();
        g.setTipo("Electrónica");
        listaGeneros.add(g);

        g = new Genero();
        g.setTipo("Heavy Metal");
        listaGeneros.add(g);

    
        return listaGeneros;

    }

    




}