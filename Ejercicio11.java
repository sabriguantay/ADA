import java.util.*;

/**
 * Ejercicio11
 */
public class Ejercicio11 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] edades = new int[10];

        /**
         * este ciclo for ingresa datos
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nro " + i);

            int numero;
            numero = Teclado.nextInt();
            edades[i] = numero;
        }

        int suma = 0;
        int prom = 0;

        for (int i = 0; i < 10; i++) {
            suma = suma + edades[i];

        }
        prom = suma / 10;
        System.out.println("El promedio es " + prom);

        System.out.println("Edades recibidas");
        /**
         * este ciclo for imprime las edades
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Edad " + edades[i]);

        }

    }
}