package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Buque
 */
public class Buque {
    // se utiliza public static con los puertos porque siempre son los mismos..
    public List<Contenedor> losContenedores = new ArrayList<Contenedor>(); // static = es de clase,todos los buques van
                                                                           // a tener la mismma cant de contenedores (no
                                                                           // lo necesitamos)
    public String nombre;

    public int calcularPeso() {
        int suma = 0;
        for (Contenedor c : this.losContenedores) {
            suma +=  c.peso; 
        }
        return suma;

    }

    // devuelve el ID del contenedor ...
    public Contenedor getContenedorMaximo() {
        Contenedor maxCont = null;
        int maxPeso;
        maxPeso =0;
        for (Contenedor c : this.losContenedores) 
        {
           if (c.peso > maxPeso)
           {
                maxPeso = c.peso;
            maxCont = c;
            
        }
    }
        return maxCont;

    }
    

    public static Buque NuevoBuqueCargado() {
        Buque barco = new Buque();
        barco.nombre = "ADA Express";

        // a los contenedores se le crea un array vacio
        barco.losContenedores = new ArrayList<Contenedor>(); // si arriba no lo asigno puedo agregar la lista de esta
                                                             // manera

        for (int i = 1; i <= 100; i++) {
            Contenedor c = new Contenedor();

            c.idContenedor = 3000 + i; // nro ficticio
            c.peso = 7 * i;

            c.puertoArribo = Puerto.BuscarPuerto((i % 3) + 1); // el resto puede ser = 0,1,2. --- +1 = 1,2,3.

            barco.losContenedores.add(c);

        }
        return barco;
    }
}
