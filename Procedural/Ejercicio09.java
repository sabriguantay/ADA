<<<<<<< HEAD
import java.util.*;

/**
 * Ejercicio09
 */
public class Ejercicio09 {

    public static Scanner Teclado= new Scanner (System.in);
    
    public static void main(String[] args) {

    int anio;
    System.out.println("Ingrese año");
    anio = Teclado.nextInt();

    if ( esBisiesto(anio)) {
        System.out.println("Es año bisiesto.");
        
    } else {

        System.out.println("No es bisiesto");

    }
    
}
    
    public static boolean  esBisiesto(int anioB)  {
 
    return (anioB % 4 == 0 && anioB % 100 != 0 || anioB % 400 == 0);

    
    }



    

    

    
}

=======
import java.util.*;

/**
 * Ejercicio09
 */
public class Ejercicio09 {

    public static Scanner Teclado= new Scanner (System.in);
    
    public static void main(String[] args) {

    int anio;
    System.out.println("Ingrese año");
    anio = Teclado.nextInt();

    if ( esBisiesto(anio)) {
        System.out.println("Es año bisiesto.");
        
    } else {

        System.out.println("No es bisiesto");

    }
    
}
    
    public static boolean  esBisiesto(int anioB)  {
 
    return (anioB % 4 == 0 && anioB % 100 != 0 || anioB % 400 == 0);

    
    }



    

    

    
}

>>>>>>> 40e622d11b8dda7addd33fae67462f60c404597b
