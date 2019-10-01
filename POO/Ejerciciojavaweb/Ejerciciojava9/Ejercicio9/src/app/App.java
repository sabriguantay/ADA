package app;

public class App {
    public static void main(String[] args) throws Exception {

        
        // espectador1.sentarse();
        Pelicula pelicula = new Pelicula("Aladdin", 120, 6, "Disney");
        double precio = 350;

        Sala sala = new Sala(pelicula);

        sala.agregarFila('A', 5); // fila a con 5 asientos
        sala.agregarFila('B', 5);
        sala.agregarFila('C', 5);
        sala.agregarFila('D', 5);

        
        Cine cine = new Cine(sala, precio, pelicula);
      
        Espectador espectador1 = new Espectador("Sabrina", 21, 1500);


        System.out.println(espectador1);

        Asiento proxAsiento = sala.proximoAsientoDisponibleParaEspectador();

        if (proxAsiento == null) {
            System.out.println("No hay asientos disponibles");
            return;
        }

        if (cine.sePuedeSentar(espectador1)) {

            System.out.println("Se pudo sentar");

            proxAsiento.setEspectador(espectador1);

        } else {
            System.out.println("El espectador no se puede sentar");
        }

        System.out.println("Pelicula reproducida: " + pelicula);
        System.out.println("Precio entrada: " + precio);

        System.out.println("Fin");
    }
}