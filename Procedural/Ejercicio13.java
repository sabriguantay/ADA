<<<<<<< HEAD
import java.util.*;

/**
 * Ejercicio13
 */
public class Ejercicio13 {
    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) {


        int contVocales = 0;
        int contEspacios = 0;
        int contPunto = 0;

        String oracion;
        char [] letras;

        System.out.println("Ingrese oracion");
        oracion = Teclado.nextLine();

        letras = oracion.toCharArray(); //


         for (int i; i < letras.length; i++);{ //lenght = propiedad de un array /arreglo.
                                                //Por eso no va en parentesis
                                                //Significa hasta el largo de "letras(array)".        

                if (esVocal(letras[i])) { //se lee = letras sub i. equivale a una vocal. lee la posicion del caracterir ubicado en i.
                    contVocales++;
                    
                } else if (letras [i] == ' ') {
                    contEspacios++;
                }
    
        
                letras [i] = Teclado.nextLine().charAt(0);
    
            }
            contPunto++;
    
            System.out.println("La cantidad de vocales es: " + contVocales);
            System.out.println("La cantidad de espacios es:  " + contEspacios);
            System.out.println("La cantidad de puntos es: " + contPunto);
    
        }
    
      public static boolean esVocal (char caracter2) {
          
        switch (caracter2) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
    
    
            }
        return false;
    
        

            }

        
    }
=======
import java.util.*;

/**
 * Ejercicio13
 */
public class Ejercicio13 {
    public static Scanner Teclado = new Scanner (System.in);
    public static void main(String[] args) {


        int contVocales = 0;
        int contEspacios = 0;
        int contPunto = 0;

        String oracion;
        char [] letras;

        System.out.println("Ingrese oracion");
        oracion = Teclado.nextLine();

        letras = oracion.toCharArray(); //


         for (int i; i < letras.length; i++);{ //lenght = propiedad de un array /arreglo.
                                                //Por eso no va en parentesis
                                                //Significa hasta el largo de "letras(array)".        

                if (esVocal(letras[i])) { //se lee = letras sub i. equivale a una vocal. lee la posicion del caracterir ubicado en i.
                    contVocales++;
                    
                } else if (letras [i] == ' ') {
                    contEspacios++;
                }
    
        
                letras [i] = Teclado.nextLine().charAt(0);
    
            }
            contPunto++;
    
            System.out.println("La cantidad de vocales es: " + contVocales);
            System.out.println("La cantidad de espacios es:  " + contEspacios);
            System.out.println("La cantidad de puntos es: " + contPunto);
    
        }
    
      public static boolean esVocal (char caracter2) {
          
        switch (caracter2) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
    
    
            }
        return false;
    
        

            }

        
    }
>>>>>>> 40e622d11b8dda7addd33fae67462f60c404597b
