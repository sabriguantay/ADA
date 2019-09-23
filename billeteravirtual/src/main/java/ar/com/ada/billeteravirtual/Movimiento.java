package ar.com.ada.billeteravirtual;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Movimiento
 */

@Entity
@Table(name = "movimiento")
public class Movimiento {

  public Date fechaMovimiento;
  public String ubicacion;
  public float importe;
  public String tipoOperacion;
  public String conceptoOperacion;
  public String detalle;
  public int estado;
  public String deUsuario;
  public String aUsuario;
  public int cuentaDestino;
  public int cuentaOrigen;

}