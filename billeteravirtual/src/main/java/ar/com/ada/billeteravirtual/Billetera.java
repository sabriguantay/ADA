package ar.com.ada.billeteravirtual;

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

@OneToMany(mappedBy = "billetera", cascade = CascadeType.ALL)
private Persona persona;

/*foreign key 
*/
}