package app;

/**
 * Persona
 */
public class Persona {

	public String nombre;
    public int dni;
    public int edad;
    public int nroCuenta;
    protected String email;

    public Persona(String nombre, int dni, int edad, int nroCuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.nroCuenta = nroCuenta;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int dni) {
        this.dni = dni;
    }

    public Persona() {
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;


    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;


    }

    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", edad=" + edad + ", nombre=" + nombre + "]";
    }

    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

}
