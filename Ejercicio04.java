<<<<<<< HEAD
import java.util.*;

/**
 * Ejercicio04
 */
public class Ejercicio04 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int valor;
        int valorMax = 0;
        int posicion = 0;

        System.out.println("Ingrese el valor");
        valor = Teclado.nextInt();

        for (int i = 1; i <= 15; i++) {

            if (valor > valorMax) {
                valorMax = valor;
                posicion = i;

            } else {

            }
            System.out.println("El valor maximo es " + valorMax);
            System.out.println("Su posicion es " + posicion);
        }

    }
=======
import java.util.*;

/**
 * Ejercicio04
 */
public class Ejercicio04 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int valor;
        int valorMax = 0;
        int posicion = 0;

        System.out.println("Ingrese el valor");
        valor = Teclado.nextInt();

        for (int i = 1; i <= 15; i++) {

            if (valor > valorMax) {
                valorMax = valor;
                posicion = i;

            } else {

            }
            System.out.println("El valor maximo es " + valorMax);
            System.out.println("Su posicion es " + posicion);
        }

    }
>>>>>>> 40e622d11b8dda7addd33fae67462f60c404597b
}