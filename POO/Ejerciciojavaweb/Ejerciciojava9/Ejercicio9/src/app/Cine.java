package app;


public class Cine {

    public Pelicula pelicula;
    public double precio_entrada;
    public int asientos;
    public Sala sala;
 
    
    public Cine(Sala sala, double precio, Pelicula pelicula) {
 

        this.precio_entrada = precio;
        this.pelicula = pelicula;
       }
 
    
    public double getPrecio() {
        return precio_entrada;
    }
 
    public void setPrecio(double precio) {
        this.precio_entrada = precio;
    }
 
    public Pelicula getPelicula() {
        return pelicula;
    }
 
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
 
    
    /**
   
     * @param e
     * @return
     */
    public boolean sePuedeSentar(Espectador e) {
        return e.tieneDinero(precio_entrada) && e.tieneEdad(pelicula.getEdadMinima());
    }
 

}
