package app;

/**
 * Espectador
 */
public class Espectador {

private String nombre;
private int edad;
private double dinero;
public int edad_minima;

public Espectador (String nombre, int edad, double dinero){
    this.nombre= nombre;
    this.edad = edad;
    this.dinero = dinero;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public boolean sentarse(){
        return true;

    }

	public boolean tieneDinero(double precio_entrada) {
		return false;
	}

	public boolean tieneEdad(int edadMinima) {
		return false;
	}


    }
