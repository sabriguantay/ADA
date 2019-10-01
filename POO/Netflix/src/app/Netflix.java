package app;

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
         Netflix.AgregarTwd ();
    }
    public static void AgregarTwd ()
    {
        Serie twd = new Serie ();
        twd.nombre = "The walking dead";
        twd.anio= 2010;
        twd.genero= "Drama post apocalíptico";

        Temporada t = new Temporada ();
        t.nroTemporada = 1;
        t.anio= 2010;
        
        Episodio ep = new Episodio ("Days Gone Bye");
        ep.nroEpisodio = 1;
        t.episodios.add(ep);


        ep = new Episodio ("Guts");
        ep.nroEpisodio = 2;
        t.episodios.add(ep);

        ep = new Episodio ("Tell It to the Frogs");
        ep.nroEpisodio = 3;
        t.episodios.add(ep);

        ep = new Episodio ("Vatos");
        ep.nroEpisodio = 4;
        t.episodios.add(ep);

        ep = new Episodio ("Wildfire");
        ep.nroEpisodio = 5;
        t.episodios.add(ep);

        ep = new Episodio ("TS-19");
        ep.nroEpisodio = 6;
        t.episodios.add(ep);

        twd.temporadas.add(t);

        t = new Temporada ("Torn Apart");
        t.nroTemporada= 1-1;
        t.anio= 2011;

        ep = new Websodio (1);
        ep.titulo= "A New Day";
        t.episodios.add(ep);

        ep = new Websodio (2);
        ep.titulo= "Family Matters";
        t.episodios.add(ep);

        ep = new Websodio (3);
        ep.titulo= "Domestic Violence";
        t.episodios.add(ep);

        ep = new Websodio (4);
        ep.titulo= "Neighborly Advice";
        t.episodios.add(ep);

        ep = new Websodio (5);
        ep.titulo= "Step-Mother";
        t.episodios.add(ep);

        ep= new Websodio (6);
        ep.titulo= "Everything Dies";
        t.episodios.add(ep);

        twd.temporadas.add(t);

        t = new Temporada ();
        t.nroTemporada = 2;
        t.anio= 2011/2012;

        ep = new Episodio("What Lies Ahead");
        ep.nroEpisodio = 1;
        t.episodios.add(ep);

        ep = new Episodio("Bloodletting");
        ep.nroEpisodio = 2;
        t.episodios.add(ep);

        ep = new Episodio("Save the Last One");
        ep.nroEpisodio = 3;
        t.episodios.add(ep);

        ep= new Episodio("Cherokee Rose");
        ep.nroEpisodio = 4;
        t.episodios.add(ep);

        ep = new Episodio("Chupacabra");
        ep.nroEpisodio = 5;
        t.episodios.add(ep);

        ep = new Episodio("Secrets");
        ep.nroEpisodio = 6;
        t.episodios.add(ep);

        
        ep = new Episodio("Pretty Much Dead Already");
        ep.nroEpisodio = 7;
        t.episodios.add(ep);

        ep = new Episodio("Nebraska");
        ep.nroEpisodio = 8;
        t.episodios.add(ep);

        ep = new Episodio("Triggerfinger");
        ep.nroEpisodio = 9;
        t.episodios.add(ep);

        ep = new Episodio("18 Miles Out");
        ep.nroEpisodio = 10;
        t.episodios.add(ep);

        ep = new Episodio("Judge, Jury, Executioner");
        ep.nroEpisodio = 11;
        t.episodios.add(ep);

        ep = new Episodio("Better Angels");
        ep.nroEpisodio = 12;
        t.episodios.add(ep);

        ep = new Episodio("Beside the Dying Fire");
        ep.nroEpisodio = 13;
        t.episodios.add(ep);

        twd.temporadas.add(t);

        t = new Temporada ("Cold Storage");
        t.nroTemporada = 2-2;
        t.anio = 2012;

        ep = new Websodio (1);
        ep.titulo = "Hide and Seek";
        t.episodios.add(ep);

        ep = new Websodio (2);
        ep.titulo = "Keys to the Kingdom";
        t.episodios.add(ep);

        ep = new Websodio (3);
        ep.titulo = "The Chosen Ones";
        t.episodios.add(ep);

        ep = new Websodio (4);
        ep.titulo = "Parting Shots";
        t.episodios.add(ep);

        twd.temporadas.add(t);
        

        t = new Temporada ();
        t.nroTemporada = 3;
        t.anio= 2012/2013;

        ep = new Episodio("Seed");
        ep.nroEpisodio = 1;
        t.episodios.add(ep);

        ep = new Episodio("Sick");
        ep.nroEpisodio = 2;
        t.episodios.add(ep);

        ep = new Episodio("Walk with Me");
        ep.nroEpisodio = 3;
        t.episodios.add(ep);

        ep = new Episodio("Killer Within");
        ep.nroEpisodio = 4;
        t.episodios.add(ep);

        ep = new Episodio("Say the Word");
        ep.nroEpisodio = 5;
        t.episodios.add(ep);

        ep = new Episodio("Hounded");
        ep.nroEpisodio = 6;
        t.episodios.add(ep);

        ep = new Episodio("When the Dead Come Knocking");
        ep.nroEpisodio = 7;
        t.episodios.add(ep);

        ep = new Episodio("Made to Suffer");
        ep.nroEpisodio = 8;
        t.episodios.add(ep);

        ep = new Episodio("The Suicide King");
        ep.nroEpisodio = 9;
        t.episodios.add(ep);

        ep = new Episodio("Home");
        ep.nroEpisodio = 10;
        t.episodios.add(ep);

        ep = new Episodio("I Ain't a Judas");
        ep.nroEpisodio = 11;
        t.episodios.add(ep);

        ep = new Episodio("Clear");
        ep.nroEpisodio = 12;
        t.episodios.add(ep);

        ep = new Episodio("Arrow on the Doorpost");
        ep.nroEpisodio = 13;
        t.episodios.add(ep);

        ep = new Episodio("Prey");
        ep.nroEpisodio = 14;
        t.episodios.add(ep);

        ep = new Episodio("This Sorrowful Life");
        ep.nroEpisodio = 15;
        t.episodios.add(ep);

        ep = new Episodio("Welcome to the Tombs");
        ep.nroEpisodio = 16;
        t.episodios.add(ep);

        twd.temporadas.add(t);

        t = new Temporada ("The Oath");
        t.nroTemporada = 3-3;
        t.anio = 2013;

        ep = new Websodio (1);
        ep.titulo = "Alone";
        t.episodios.add(ep);

        ep = new Websodio (2);
        ep.titulo = "Choice";
        t.episodios.add(ep);

        ep = new Websodio (3);
        ep.titulo = "Bond";
        t.episodios.add(ep);

        twd.temporadas.add(t);

        t = new Temporada ();
        t.nroTemporada = 4;
        t.anio= 2013/2014;

        ep= new Episodio ("30 Days Without an Accident");
        ep.nroEpisodio = 1;
        t.episodios.add(ep);

        ep = new Episodio("Infected");
        ep.nroEpisodio = 2;
        t.episodios.add(ep);

        ep = new Episodio("Insolation");
        ep.nroEpisodio = 3;
        t.episodios.add(ep);

        ep = new Episodio("Indifference");
        ep.nroEpisodio = 4;
        t.episodios.add(ep);

        ep = new Episodio("Internment");
        ep.nroEpisodio = 5;
        t.episodios.add(ep);

        ep = new Episodio("Live Bait");
        ep.nroEpisodio = 6;
        t.episodios.add(ep);

        ep = new Episodio("Dead Weight");
        ep.nroEpisodio = 7;
        t.episodios.add(ep);

        ep = new Episodio("Too Far Gone");
        ep.nroEpisodio = 8;
        t.episodios.add(ep);

        ep = new Episodio("After");
        ep.nroEpisodio = 9;
        t.episodios.add(ep);

        ep = new Episodio("Inmate");
        ep.nroEpisodio = 10;
        t.episodios.add(ep);

        ep = new Episodio("Claimed");
        ep.nroEpisodio = 11;
        t.episodios.add(ep);

        ep = new Episodio("Still");
        ep.nroEpisodio = 12;
        t.episodios.add(ep);

        ep = new Episodio("Alone");
        ep.nroEpisodio = 13;
        t.episodios.add(ep);

        ep = new Episodio("The Grove");
        ep.nroEpisodio = 14;
        t.episodios.add(ep);

        ep = new Episodio("US");
        ep.nroEpisodio = 15;
        ep.titulo= "US";
        t.episodios.add(ep);

        ep = new Episodio("A");
        ep.nroEpisodio = 16;
        t.episodios.add(ep);

        twd.temporadas.add(t);


        t = new Temporada ();
        t.nroTemporada = 5;
        t.anio= 2014/2015;

        ep = new Episodio("No Sanctuary");
        ep.nroEpisodio = 1;
        t.episodios.add(ep);

        ep = new Episodio("Strangers");
        ep.nroEpisodio = 2;
        t.episodios.add(ep);

        ep = new Episodio("Four Walls and a Roof");
        ep.nroEpisodio = 3;
        t.episodios.add(ep);

        ep = new Episodio("Slabtown");
        ep.nroEpisodio = 4;
        t.episodios.add(ep);

        ep = new Episodio("Self Help");
        ep.nroEpisodio = 5;
        t.episodios.add(ep);

        ep = new Episodio("Consumed");
        ep.nroEpisodio = 6;
        t.episodios.add(ep);

        ep = new Episodio("Crossed");
        ep.nroEpisodio = 7;
        t.episodios.add(ep);

        ep= new Episodio("Coda");
        ep.nroEpisodio = 8;
        t.episodios.add(ep);

        ep= new Episodio("What Happened and What's Going On");
        ep.nroEpisodio = 9;
        t.episodios.add(ep);

        ep = new Episodio("Them");
        ep.nroEpisodio = 10;
        t.episodios.add(ep);

        ep = new Episodio("The Distance");
        ep.nroEpisodio = 11;
        t.episodios.add(ep);

        ep = new Episodio("Remember");
        ep.nroEpisodio = 12;
        t.episodios.add(ep);

        ep = new Episodio("Forget");
        ep.nroEpisodio = 13;
        t.episodios.add(ep);

        ep = new Episodio("Spend");
        ep.nroEpisodio = 14;
        t.episodios.add(ep);

        ep = new Episodio("Try");
        ep.nroEpisodio = 15;
        t.episodios.add(ep);

        ep = new Episodio("Conquer");
        ep.nroEpisodio = 16;
        t.episodios.add(ep);

        twd.temporadas.add(t);

        t = new Temporada ();
        t.nroTemporada = 6;
        t.anio= 2015/2016;

        ep = new Episodio("First Time Again");
        ep.nroEpisodio = 1;
        t.episodios.add(ep);

        ep = new Episodio("JSS");
        ep.nroEpisodio = 2;
        t.episodios.add(ep);

        ep = new Episodio("Thank You");
        ep.nroEpisodio = 3;
        t.episodios.add(ep);

        ep = new Episodio("Here's Not Here");
        ep.nroEpisodio = 4;
        t.episodios.add(ep);

        ep = new Episodio("Now");
        ep.nroEpisodio = 5;
        t.episodios.add(ep);

        ep = new Episodio("Always Accountable");
        ep.nroEpisodio = 6;
        t.episodios.add(ep);

        ep = new Episodio("Heads Up");
        ep.nroEpisodio = 7;
        t.episodios.add(ep);

        ep = new Episodio("Start to Finish");
        ep.nroEpisodio = 8;
        t.episodios.add(ep);

        ep = new Episodio("No Way Out");
        ep.nroEpisodio = 9;
        t.episodios.add(ep);

        ep = new Episodio("The Next World");
        ep.nroEpisodio = 10;
        t.episodios.add(ep);

        ep = new Episodio("Knots Untie");
        ep.nroEpisodio = 11;
        t.episodios.add(ep);

        ep = new Episodio("Not Tomorrow Yet");
        ep.nroEpisodio = 12;
        t.episodios.add(ep);

        ep = new Episodio("The Same Boat");
        ep.nroEpisodio = 13;
        t.episodios.add(ep);

        ep = new Episodio("Twice as Far");
        ep.nroEpisodio = 14;
        t.episodios.add(ep);

        ep = new Episodio("East");
        ep.nroEpisodio = 15;
        t.episodios.add(ep);

        ep = new Episodio("Last Day on Earth");
        ep.nroEpisodio = 16;
        t.episodios.add(ep);

        twd.temporadas.add(t);

        t = new Temporada ();
        t.nroTemporada = 7;
        t.anio= 2016/2017;

        ep = new Episodio("The Day Will Come When You Won't Be");
        ep.nroEpisodio = 1;
        t.episodios.add(ep);

        ep = new Episodio("The Well");
        ep.nroEpisodio = 2;
        t.episodios.add(ep);

        ep = new Episodio("The Cell");
        ep.nroEpisodio = 3;
        t.episodios.add(ep);

        ep = new Episodio("Service");
        ep.nroEpisodio = 4;
        t.episodios.add(ep);

        ep = new Episodio("Go Getters");
        ep.nroEpisodio = 5;
        t.episodios.add(ep);

        ep = new Episodio("Swear");
        ep.nroEpisodio = 6;
        t.episodios.add(ep);

        ep = new Episodio("Sing Me a Song");
        ep.nroEpisodio = 7;
        t.episodios.add(ep);

        ep = new Episodio("Hearts Still Beating");
        ep.nroEpisodio = 8;
        t.episodios.add(ep);

        ep = new Episodio("Rock in the Road");
        ep.nroEpisodio = 9;
        t.episodios.add(ep);

        ep = new Episodio("New Best Friends");
        ep.nroEpisodio = 10;
        t.episodios.add(ep);

        ep = new Episodio("Hostiles and Calamities");
        ep.nroEpisodio = 11;
        t.episodios.add(ep);

        ep = new Episodio("Say Yes");
        ep.nroEpisodio = 12;
        t.episodios.add(ep);

        ep = new Episodio("Bury Me Here");
        ep.nroEpisodio = 13;
        t.episodios.add(ep);

        ep = new Episodio("The Other Side");
        ep.nroEpisodio = 14;
        t.episodios.add(ep);

        ep = new Episodio("Something They Need");
        ep.nroEpisodio = 15;
        t.episodios.add(ep);

        ep = new Episodio("The First Day of the Rest of Your Life");
        ep.nroEpisodio = 16;
        t.episodios.add(ep);

        twd.temporadas.add(t);

        t = new Temporada ();
        t.nroTemporada = 8;
        t.anio= 2017/2018;

        ep = new Episodio("Mercy");
        ep.nroEpisodio = 1;
        t.episodios.add(ep);

        ep = new Episodio("The Damned");
        ep.nroEpisodio = 2;
        t.episodios.add(ep);

        ep = new Episodio("Monsters");
        ep.nroEpisodio = 3;
        t.episodios.add(ep);

        ep = new Episodio("Some Guy");
        ep.nroEpisodio = 4;
        t.episodios.add(ep);

        ep = new Episodio("The Big Scary U");
        ep.nroEpisodio = 5;
        t.episodios.add(ep);

        ep = new Episodio("The King, the Widow and Rick");
        ep.nroEpisodio = 6;
        t.episodios.add(ep);

        ep = new Episodio("Time for After");
        ep.nroEpisodio = 7;
        t.episodios.add(ep);

        ep = new Episodio("How It's Gotta Be");
        ep.nroEpisodio = 8;
        t.episodios.add(ep);

        ep = new Episodio("Honor");
        ep.nroEpisodio = 9;
        t.episodios.add(ep);

        ep = new Episodio("The Lost and the Plunderers");
        ep.nroEpisodio = 10;
        t.episodios.add(ep);

        ep = new Episodio("Dead or Alive Or");
        ep.nroEpisodio = 11;
        t.episodios.add(ep);

        ep = new Episodio("The Key");
        ep.nroEpisodio = 12;
        t.episodios.add(ep);

        ep = new Episodio("Do Not Send Us Astray");
        ep.nroEpisodio = 13;
        t.episodios.add(ep);

        ep = new Episodio("Still Gotta Mean Something");
        ep.nroEpisodio = 14;
        t.episodios.add(ep);

        ep = new Episodio("Worth");
        ep.nroEpisodio = 15;
        t.episodios.add(ep);

        ep = new Episodio("Wrath");
        ep.nroEpisodio = 16;
        t.episodios.add(ep);

        twd.temporadas.add(t);

        t = new Temporada ();
        t.nroTemporada = 9;
        t.anio= 2018/2019;

        ep = new Episodio("A New Beginning");
        ep.nroEpisodio = 1;
        t.episodios.add(ep);

        ep = new Episodio("The Bridge");
        ep.nroEpisodio = 2;
        t.episodios.add(ep);

        ep = new Episodio("Warning Signs");
        ep.nroEpisodio = 3;
        t.episodios.add(ep);

        ep = new Episodio("The Obliged");
        ep.nroEpisodio = 4;
        t.episodios.add(ep);

        ep = new Episodio("What Comes After");
        ep.nroEpisodio = 5;
        t.episodios.add(ep);

        ep = new Episodio("Who Are You Now?");
        ep.nroEpisodio = 6;
        t.episodios.add(ep);

        ep = new Episodio("Stradivarius");
        ep.nroEpisodio = 7;
        t.episodios.add(ep);

        ep = new Episodio("Evolution");
        ep.nroEpisodio = 8;
        t.episodios.add(ep);

        ep = new Episodio("Adaptation");
        ep.nroEpisodio = 9;
        t.episodios.add(ep);

        ep = new Episodio("Omega");
        ep.nroEpisodio = 10;
        t.episodios.add(ep);

        ep = new Episodio("Bounty");
        ep.nroEpisodio = 11;
        t.episodios.add(ep);

        ep = new Episodio("Guardians");
        ep.nroEpisodio = 12;
        t.episodios.add(ep);

        ep = new Episodio("Chokepoint");
        ep.nroEpisodio = 13;
        t.episodios.add(ep);

        ep = new Episodio("Scars");
        ep.nroEpisodio = 14;
        t.episodios.add(ep);

        ep = new Episodio("The Calm Before");
        ep.nroEpisodio = 15;
        t.episodios.add(ep);

        ep = new Episodio("The Storm");
        ep.nroEpisodio = 16;
        t.episodios.add(ep);

        twd.temporadas.add(t);


        t = new Temporada ();
        t.nroTemporada = 10;
        t.anio= 2019/2020;  //cómo le agrego un "próximamente?"

        twd.temporadas.add(t);

        Netflix.CatalogoSeries.add(twd);

        
        


    }
}