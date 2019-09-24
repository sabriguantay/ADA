package ar.com.ada.billeteravirtual;

import javax.persistence.*;

import ar.com.ada.billeteravirtual.excepciones.EdadException;

/**
 * Persona
 */
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @Column(name = "persona_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int pesonaId;
    public String nombre;
    public String dni;
    public int edad;
    public String email;

    @OneToOne( mappedBy = "persona", cascade = CascadeType.ALL)
    private Usuario usuario;

    public Persona(String nombre, String dni, int edad, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.email = email;
    }

    public Persona() {
    }

    public int getPersonaId() {
        return pesonaId;
    }

    public void setPersonaId(int pesonaId) {
        this.pesonaId = pesonaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.usuario.setPersona(this); // Vinculamos ambos objetos entre si
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }
}