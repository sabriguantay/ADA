package app;


/**
 * Asiento
 */
public class Asiento {
   



    private char letra;
    private int fila;
    private Espectador espectador; 
 
    public Asiento(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
        this.espectador = null; 
    }

    

   
    public char getLetra() {
        return letra;
    }
 
    public void setLetra(char letra) {
        this.letra = letra;
    }
 
    public int getFila() {
        return fila;
    }


    public Espectador getEspectador() {
        return espectador;
    }
 
    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
 
    
    public boolean ocupado() {
        return espectador != null;
    }
 
    @Override
    public String toString() {
        if (ocupado()) {
            return "Asiento: " + fila + letra + " y " + espectador;
        }
 
        return "Asiento: " + fila + letra + " y este asiento está vacio ";

}
}