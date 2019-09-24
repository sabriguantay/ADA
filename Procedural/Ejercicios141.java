<<<<<<< HEAD
import java.util.*;

/**
 * Ejercicio141- Challenge1
 */
public class Ejercicio141 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int suma = 0;
        int n;

        System.out.println("Ingrese cant de nros");
        n = Teclado.nextInt();


        boolean hay13 = false;

        // delcaro el array de N posiciones
        int[] nros = new int[n];

        // recorro el array para llenarlo
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nro");

            nros[i] = Teclado.nextInt();

        }
        // aca recorro y pregunto por 13 -- se ponene flags-- si es 13, ignora la suma.
        for (int i = 0; i < n; i++) {
            if (nros[i] == 13) {
                hay13 = true;

            } else {
                if (!hay13) { //means: no hay 13
                    suma = suma + nros[i];

                } else {
                    hay13 = false;
                }
            }
        }

        System.out.println("La suma es " + suma);
    }
    
}

=======
import java.util.*;

/**
 * Ejercicio141- Challenge1
 */
public class Ejercicio141 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int suma = 0;
        int n;

        System.out.println("Ingrese cant de nros");
        n = Teclado.nextInt();


        boolean hay13 = false;

        // delcaro el array de N posiciones
        int[] nros = new int[n];

        // recorro el array para llenarlo
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nro");

            nros[i] = Teclado.nextInt();

        }
        // aca recorro y pregunto por 13 -- se ponene flags-- si es 13, ignora la suma.
        for (int i = 0; i < n; i++) {
            if (nros[i] == 13) {
                hay13 = true;

            } else {
                if (!hay13) { //means: no hay 13
                    suma = suma + nros[i];

                } else {
                    hay13 = false;
                }
            }
        }

        System.out.println("La suma es " + suma);
    }
    
}

>>>>>>> 40e622d11b8dda7addd33fae67462f60c404597b
