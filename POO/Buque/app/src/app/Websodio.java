
package app;

/**
 * Webosodio
 */
public class Websodio extends Episodio {

    public Websodio (String tit){
    super (tit);
}

 public void reproducir(){
    System.out.println("Reproduciendo el websodio: " + this.titulo);
 }
    
}

