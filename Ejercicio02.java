import java.util.*;
/**
 * Ejercicio02
 */
public class Ejercicio02 {

    public static Scanner Teclado = new Scanner (System.in);
    public static void main (String[] args) {

    int a,b; 
    System.out.println("Ingrese el valor de a");
    a = Teclado.nextInt();
    System.out.println("Ingrese el valor de b");
    b = Teclado.nextInt();
    


    if (a > b) {
        System.out.print("a es mayor que b");        
    } 
    else {
        if (a == b) {
        System.out.println("a es igual que b");    
        } 
        else { 
        System.out.println("a es menor que b");
            
        }
        
    }
        
    }
}