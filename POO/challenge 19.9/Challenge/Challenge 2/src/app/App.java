package app;

public class App {
    public static void main(String[] args) throws Exception {

        Persona p = new Persona ();vb0
        Persona p2 = p;
        p.nombre = "Ana";
        cambiar(p);
        System.out.println(p);
    }
f
    public static void cambiar (Persona b){ //Persona b es una referencia
        b.nombre = "Pedro"
    }
    //Esto es pasar dato por referencia.
    //funciona porque es un objeto, el otro es un primitivo.
}