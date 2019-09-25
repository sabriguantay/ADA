package ar.com.ada.billeteravirtual;

/**
 * Dinero
 */
public class Dinero {

    public Integer dineroId;
    public String moneda;
    public int cantidad;

    public Dinero (){
        
    }

    public Integer getDineroId() {
        return dineroId;
    }

    public void setDineroId(Integer dineroId) {
        this.dineroId = dineroId;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}