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
  public double importe;
  public String tipo_operacion;
  public String concepto_operacion;
  public String detalle;
  public int estado;
  public int de_usuario;
  public int a_usuario;
  public int cuenta_destino;
  public int cuenta_origen;

  @OneToMany
  @JoinColumn(name = "movimiento_id", referencedColumnName = "movimiento_id")
    private Cuenta cuenta;

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  public Integer getMovimientoId() {
    return movimientoId;
  }

  public void setMovimientoId(Integer movimientoId) {
    this.movimientoId = movimientoId;
  }

  public Date getFechaMovimiento() {
    return fechaMovimiento;
  }

  public void setFechaMovimiento(Date fechaMovimiento) {
    this.fechaMovimiento = fechaMovimiento;
  }

  public Coordenada getUbicacion() {
    return ubicacion;
  }

  public void setUbicacion(Coordenada ubicacion) {
    this.ubicacion = ubicacion;
  }

  public String getTipo_operacion() {
    return tipo_operacion;
  }

  public void setTipo_operacion(String tipo_operacion) {
    this.tipo_operacion = tipo_operacion;
  }

  public String getConcepto_operacion() {
    return concepto_operacion;
  }

  public void setConcepto_operacion(String concepto_operacion) {
    this.concepto_operacion = concepto_operacion;
  }

  public String getDetalle() {
    return detalle;
  }

  public void setDetalle(String detalle) {
    this.detalle = detalle;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public int getDe_usuario() {
    return de_usuario;
  }

  public void setDe_usuario(int de_usuario) {
    this.de_usuario = de_usuario;
  }

  public int getA_usuario() {
    return a_usuario;
  }

  public void setA_usuario(int a_usuario) {
    this.a_usuario = a_usuario;
  }

  public int getCuenta_destino() {
    return cuenta_destino;
  }

  public void setCuenta_destino(int cuenta_destino) {
    this.cuenta_destino = cuenta_destino;
  }

  public int getCuenta_origen() {
    return cuenta_origen;
  }

  public void setCuenta_origen(int cuenta_origen) {
    this.cuenta_origen = cuenta_origen;
  }

  public Cuenta getCuenta() {
    return cuenta;
  }

  public void setCuenta(Cuenta cuenta) {
    this.cuenta = cuenta;
  }

  /*@OneToOne
    @JoinColumn(name = "a_usuario_id")

    @OneToOne
    @JoinColumn(name = "de_usuario_id")*/
     

  




}