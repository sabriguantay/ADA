package ar.com.ada.billeteravirtual;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Billetera
 */

@Entity
@Table(name = "billetera")
public class Billetera {

@OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
private Cuenta cuenta;


//List <Cuenta> 





}