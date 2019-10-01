package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando Catálogo");
        Netflix.InicializarCatalogo ();

        Serie twd = Netflix.BuscarSerie ("The walking dead");

        Temporada favorita = twd.getTemporada (7);

        Episodio Caryl;

        Caryl = favorita.getEpisodio(1);

        Caryl.Reproducir ();
    }

}