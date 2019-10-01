
package app;

/**
 * Cuenta
 */
public class Cuenta {

    protected String titular;
    protected double cantidad; 
    
    public final double MAX_LIMITE = 1000;
    
    public Cuenta(String titular) { // para que use el Constructor con 2 parametros.
        this(titular, 0); //Sobrecarga // reutilizar el codigo // se hardcodea el nro con "0".
    }
 
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }
    // Ejemplo para entender setters and getters//
    //public String getTitular(){
        //if (this.titular.equals("Pepe")){
            //return this.titular + "VIP";

    
        
    public String getTitular() {
        return titular;
    }
 
    public void setTitular(String titular) {
        this.titular = titular;
    }
 
    public double getCantidad() {
        return cantidad;
    }
 
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
 
    /**
     * Ingresa dinero en la cuenta, 
     * solo si es positivo la cantidad
     *
     * @param cantidad
     */
    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.cantidad += cantidad;   
        }
    }
 
    /**
     * Retira una cantidad en la cuenta, si se quedara en negativo se quedaria
     * en cero
     *
     * @param cantidad
     */
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }
 
    /**
     * Devuelve el estado del objeto
     *
     * @return
     */
    @Override
    public String toString() {
        return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
    }
 
}





