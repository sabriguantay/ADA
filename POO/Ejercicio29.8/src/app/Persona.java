package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Persona
 */
public class Persona {

    public String nombre;
    public long dni;
    public int edad;

    public Persona (String nombre, long dni, int edad ){
        this.nombre = nombre;
        this.dni= dni;
        this.edad = edad;
    }

        public static void personas(){ 
            List<Persona> personas; 
            personas = new ArrayList<Persona>();
    
            Persona p1 = new Persona("Ariel", 40000000, 21);
            personas.add(p1);

          

    }




    
}