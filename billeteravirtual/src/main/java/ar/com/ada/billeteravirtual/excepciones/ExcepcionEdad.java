package ar.com.ada.billeteravirtual.excepciones;

import ar.com.ada.billeteravirtual.Persona;

/**
 * ExcepcionEdad
 */
public class ExcepcionEdad  {
    private Persona persona;
    private String mensaje;

    public ExcepcionEdad(Persona p, String mensaje) {
       this.persona = p;
       this.mensaje = mensaje;
               // super(p.getNombre()+":"+mensaje);

    }
}