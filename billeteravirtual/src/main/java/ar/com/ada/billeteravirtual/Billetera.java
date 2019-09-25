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
public Integer billeteraID; 

@OneToMany(mappedBy = "billetera", cascade = CascadeType.ALL)
private Cuenta cuenta;

@OneToOne
@JoinColumn (name = "persona_id", referencedColumnName = "persona_id")
private Persona persona;

private List <Cuenta> cuentas = new ArrayList<Cuenta>();



public Billetera (){

}

public Billetera (Integer billeteraId){
    this.billeteraID= billeteraId;
}


    public Persona getPersona() {
        return persona;
    }

    public Integer getBilleteraID() {
        return billeteraID;
    }

    public void setBilleteraID(Integer billeteraID) {
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