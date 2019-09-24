package ar.com.ada.billeteravirtual.excepciones;

import ar.com.ada.billeteravirtual.Persona;

/**
 * ExcepcionEdad
 */
public class ExcepcionEdad extends Exception{
    private Persona persona;
   

    public ExcepcionEdad(Persona p, String mensaje) {
      
        super(p.getNombre()+":"+mensaje);
        this.persona = p;

    }
}