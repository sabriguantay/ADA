package ar.com.ada.mongo.pooflix.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Netflix
 */
public class Netflix {

    public static List<Peli> CatalogoPelis = new ArrayList<Peli>();
    public static List<Serie> CatalogoSeries = new ArrayList<Serie>();

    

    public static Serie BuscarSerie(String nombre) {

        for (Serie s : Netflix.CatalogoSeries) {
            if (nombre.equals(s.nombre)) { // Se puede buscar por nombre, año, genero poniendo s.genero
                return s;

            }
        }
        return null;
    }

    public static Peli BuscarPeli(String nombre) {

        for (Peli p : Netflix.CatalogoPelis) {
            if (nombre.equals(p.nombre)) {
                return p;
            }

        }
        return null;
    }

    public static void InicializarCatalogo() {
         Netflix.agregarEuphoria();
    }
    public static void agregarEuphoria ()
    {
        Serie euphoria = new Serie ();
        euphoria.nombre = "Euphoria";
        euphoria.anio= 2019;
        euphoria.genero= "Drama";

        Temporada t = new Temporada ();
        t.nroTemporada = 1;
        t.anio= 2019;
        
        Episodio ep = new Episodio ("Pilot");
        ep.nroEpisodio = 1;
        t.episodios.add(ep);


        ep = new Episodio ("Stuntin' Like My Daddy");
        ep.nroEpisodio = 2;
        t.episodios.add(ep);

        ep = new Episodio ("Made You Look");
        ep.nroEpisodio = 3;
        t.episodios.add(ep);

        ep = new Episodio ("Shook One Pt. II");
        ep.nroEpisodio = 4;
        t.episodios.add(ep);

        ep = new Episodio ("Bonnie and Clyde");
        ep.nroEpisodio = 5;
        t.episodios.add(ep);

        ep = new Episodio ("The Next Episode");
        ep.nroEpisodio = 6;
        t.episodios.add(ep);

        
        ep = new Episodio ("The Trials and Tribulations of Trying to Pee While Depressed");
        ep.nroEpisodio = 7;
        t.episodios.add(ep);
        

        ep = new Episodio ("And Salt the Earth Behind You");
        ep.nroEpisodio = 8;
        t.episodios.add(ep);

        euphoria.temporadas.add(t);


        ep = new Websodio (1);
        ep.titulo= "Pool party";
        t.episodios.add(ep);

        ep = new Websodio (2);
        ep.titulo= "Not too funny";
        t.episodios.add(ep);

        ep = new Websodio (3);
        ep.titulo= "Savage";
        t.episodios.add(ep);

        ep = new Websodio (4);
        ep.titulo= "Hot summer";
        t.episodios.add(ep);

        ep = new Websodio (5);
        ep.titulo= "See-saw";
        t.episodios.add(ep);

        ep= new Websodio (6);
        ep.titulo= "Rollercoaster";
        t.episodios.add(ep);

        ep= new Websodio (7);
        ep.titulo= "Vulgar";
        t.episodios.add(ep);

        ep= new Websodio (8);
        ep.titulo= "Superwoman";
        t.episodios.add(ep);

        euphoria.temporadas.add(t);

       

        Netflix.CatalogoSeries.add(euphoria);

        
        


    }
}