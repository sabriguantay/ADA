import java.util.*;

/**
 * Ejercicio08
 */
public class Ejercicio08 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int calificacion;    

        System.out.println("Ingrese calificacion en numero");
        calificacion = Teclado.nextInt();
        
        while (calificacion <= 10 ) {
            switch (calificacion) {
                case 10:
                    System.out.println("La calificacion equivalente es: A");
    
                    break;
    
                case 9:
                    System.out.println("La calificacion equivalente es: B");
                    break;
    
                case 8:
                    System.out.println("La calificacion equivalente es: C");
                    break;
    
                case 7:
                case 6:
                    System.out.println("La calificacion equivalente es: D");
                    break;
    
                default:
                    System.out.println("La calificacion equivalente es: F");
                    break;


            
        }

        System.out.println("Ingrese calificacion");
        calificacion = Teclado.nextInt();
            
            }
        
        }
  
    }
    
