package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Netflix
 */
public class Netflix {

    public static List<Peli> catalogoPelis = new ArrayList<Peli>();
    public static List<Serie> catalogoSeries = new ArrayList<Serie>(); // variable de clase

    public static Serie getbuscarSerie(String nombre) {
        for (Serie nombreSerie : Netflix.catalogoSeries) {
            if (nombreSerie.nombre.equals(nombre)) {
                return nombreSerie;
            }

        }
        return null;
    }

    public static Peli getbuscarPeli(String nombre) {
        for (Peli nombrePeli : Netflix.catalogoPelis) {
            if (nombrePeli.nombre.equals(nombre)) {
                return nombrePeli;
            }

        }
        return null;

    }

    public static void LimpiarCatalogo(){
        Netflix.catalogoPelis.clear();
        Netflix.catalogoSeries.clear();
    }

    public static void inicializarCatalogo() {
        Netflix.AgregarGlee();
    }

    public static void AgregarGlee() {

        Serie glee = new Serie();
        glee.nombre = "Glee";
        glee.año = 2009;
        glee.genero = "Comedia";

        Temporada t1 = new Temporada();
        t1.numeroTemporada = 1;

        Episodio ep = new Episodio("Dancing");
        ep.nroEpisodio = 1;
        ep.duracion = 43;

        t1.episodios.add(ep);

        Episodio ep2 = new Episodio("Sing along");
        ep.nroEpisodio = 2;
       
        ep.duracion = 43;

        t1.episodios.add(ep2);

        Episodio ep3 = new Episodio("Playing with fire");
        ep.nroEpisodio = 3;
        ep.duracion = 41;

        t1.episodios.add(ep3);

        glee.temporadas.add(t1);

        Netflix.catalogoSeries.add(glee);



        Websodio websodio = new Websodio("Power");
        websodio.nroEpisodio= 4;
        websodio.duracion = 5;


        t1.episodios.add(websodio);
        Netflix.catalogoSeries.add(glee);

    }





}



