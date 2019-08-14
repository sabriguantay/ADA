import java.util.*;

/**
 * Ejercicio10
 */
public class Ejercicio10 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int contVocales = 0;
        int contEspacios = 0;
        int contPunto = 0;

        char caracter;

        System.out.println("Ingrese caracter por caracter hasta el punto");
        caracter = Teclado.nextLine().charAt(0); /**
                             * 
                             * caracter = Teclado.nextLine(),charAt(0);
                             *  es lo mismo que: 
                             * linea = teclado.nextLine(); 
                             * caracter = linea.caracter (... falta completar)
                             *  2da opcion sino declaro el teclado arriba --- Scanner Teclado = new Scanner
                             * (System.in); + select Quick Fix y elegir Import Scanner u otro
                             */

        while (caracter != '.') {

            if (esVocal(caracter)) {
                contVocales++;
                
            } else if (caracter == ' ') {
                contEspacios++;
            }
                
            

            System.out.println("Ingrese caracter");
            caracter = Teclado.nextLine().charAt(0);

        }
        contPunto++;

        System.out.println("La cantidad de vocales es: " + contVocales);
        System.out.println("La cantidad de espacios es:  " + contEspacios);
        System.out.println("La cantidad de puntos es: " + contPunto);

    }

  public static boolean esVocal(char caracter2){
      
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