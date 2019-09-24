package ar.com.ada.billeteravirtual;
import javax.persistence.*;


/**
 * Usuario
 */
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "usuario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usuarioID;
    private String username;
    private String password;
    private String email;
    
    
    @OneToOne             //persona id es la FK de Usuario
    @JoinColumn(name = "persona_id", referencedColumnName = "persona_id") //PK en Persona
    //@MapsId -- segunda opcion. se aplica sin el joinColumn. Lo mapea
    private Persona persona;

    public Usuario(String username, String password, String email) {
       
        this.username = username;
        this.password = password;
        this.email = email;
        
    }
    

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario() {
    }

    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Usuario [email=" + email + ", password=" + password + ", username=" + username + "]";
    }

}