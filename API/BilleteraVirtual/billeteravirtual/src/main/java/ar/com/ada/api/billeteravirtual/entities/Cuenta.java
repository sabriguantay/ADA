package ar.com.ada.api.billeteravirtual.entities;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * Cuenta
 */
@Entity
@Table(name = "cuenta")
public class Cuenta {
    
    @Id
    @Column(name = "cuenta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int cuentaId;

    protected String moneda;
    protected double saldo;
    @Column(name = "saldo_disponible")
    protected double saldoDisponible;
    
    @ManyToOne
    @JoinColumn(name = "billetera_id", referencedColumnName = "billetera_id")
    private Billetera billetera;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Movimiento> movimientos = new ArrayList<Movimiento>();

    public Cuenta(){
    }

    public Cuenta(Billetera b, String moneda) {

        this.moneda = moneda;
        b.getCuentas().add(this);

    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    /**
     * @param billetera the usuario to set
     */

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }

    /**
     * @return the usuario
     */

    public Billetera getBilletera() {
        return billetera;
    }

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void agregarMovimiento(Movimiento movimiento){
		movimiento.setCuenta(this);
		this.movimientos.add(movimiento);
		this.setSaldo(this.getSaldo() + movimiento.getImporte());
    }
    
}