package app;

import java.util.List;
import java.util.ArrayList;

/**
 * Sala
 */
public class Sala {

    public Pelicula peli;
    public List<Fila> filas = new ArrayList<Fila>();


    public Sala(Pelicula peli) {
        this.peli = peli;
    }


    /**
     *
     * @param letra
     * @param cantAsientos
     */
    public void agregarFila(char letra, int cantAsientos) {
        Fila f = new Fila();
        f.letra = letra;
        f.agregarAsientos(cantAsientos);

        filas.add(f);

    }

    public Asiento proximoAsientoDisponibleParaEspectador() {
        for (Fila f : filas) {
            for (Asiento a : f.asientos) {
                if (!a.ocupado())
                    return a;
            }
        }
        return null;
    }

    
    public List<Asiento> asientosLibres() {
 
        List<Asiento> r = new ArrayList<Asiento>();

        for (Fila f : filas) {
            for (Asiento a : f.asientos) {
                if (!a.ocupado())
                    r.add(a);
            }
        }
        return r;
    }

   
    public int cantAsientosLibres() {
        return this.asientosLibres().size();
    }

    public boolean puedeVer(Espectador espectador) {

        return peli.getEdadMinima() > espectador.getEdad();

    }

}
        
