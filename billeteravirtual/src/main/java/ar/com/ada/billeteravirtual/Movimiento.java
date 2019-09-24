package ar.com.ada.billeteravirtual;

import java.util.Date;

import javax.persistence.*;

/**
 * Movimiento
 */

@Entity
@Table(name = "movimiento")
public class Movimiento {

@Id
@Column (name = "movimiento_id")
@GeneratedValue (strategy = GenerationType.IDENTITY) 
  public Integer movimientoId;

@Column (name = "fecha_hora")
  public Date fechaMovimiento;
  public Coordenada ubicacion;
  public float importe;
  @Column (name = "tipo_operacion")
  public String tipoOperacion;
  @Column (name = "concepto_operacion")
  public String conceptoOperacion;
  public String detalle;
  public int estado;
  @Column (name = "de_usuario")
  public String deUsuario;
  @Column (name = "a_usuario")
  public String aUsuario;
  @Column (name = "cuenta_destino")
  public int cuentaDestino;
  @Column (name = "cuenta_origen")
  public int cuentaOrigen;

  @OneToMany
  @JoinColumn(name = "movimiento_id", referencedColumnName = "movimiento_id")
    private Cuenta cuenta;

  @OneToOne
    @JoinColumn(name = "a_usuario_id")

    @OneToOne
    @JoinColumn(name = "de_usuario_id")
     

  




}