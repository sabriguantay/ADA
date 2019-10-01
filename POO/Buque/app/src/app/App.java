package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando Catalogo");

        Netflix.inicializarCatalogo();
        
        Serie glee = Netflix.getbuscarSerie("Glee");
        
        Temporada laMejorTemporada = glee.getTemporada(1);
        
        Episodio elTop;
        
        elTop = laMejorTemporada.getEpisodio(4);
        elTop.reproducir();

        
        
        
    }
}