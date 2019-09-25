package ar.com.ada.billeteravirtual;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Billetera
 */

@Entity
@Table(name = "billetera")
public class Billetera {

@Id
@Column (name = "billetera_id")
@GeneratedValue (strategy = GenerationType.IDENTITY)
public int billeteraID; 

@OneToMany(mappedBy = "billetera", cascade = CascadeType.ALL)
private List <Cuenta> cuentas = new ArrayList<Cuenta>();

@OneToOne
@JoinColumn (name = "persona_id", referencedColumnName = "persona_id")
private Persona persona;



public Billetera (){

}

public Billetera (int billeteraId){
    this.billeteraID= billeteraId;
}


    public Persona getPersona() {
        return persona;
    }

    public int getBilleteraID() {
        return billeteraID;
    }

    public void setBilleteraID(int billeteraID) {
        this.billeteraID = billeteraID;
    }

    public static void agregarCuentas(){

    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }



    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    

    public void setPersona(Persona persona) {
        this.persona = persona;
        this.persona.setBilletera(this);
    }

    public void agregarCuentas (Cuenta cuenta) {
        cuenta.setBilletera(this);
        this.cuentas.add(cuenta); 

    }

}