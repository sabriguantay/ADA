import java.util.*;

/**
 * Ejercicio12
 */
public class Ejercicio12 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = new int[7];
        int[] b = new int[7];
        int[] c = new int[7];

        for (int i = 0; i < 7; i++)

        {
            System.out.println("Ingrese nro del array A");
            a[i] = Teclado.nextInt();

        }

        for (int i = 0; i < 7; i++)

        {
            System.out.println("Ingrese nro del array B");
            b[i] = Teclado.nextInt();

        }

        for (int i = 0; i < 7; i++) {

            c[i] = a[i] + b[i];
        }

        System.out.println("El valor de c es ");


        for (int i = 0; i < 7; i++)

        {
            System.out.println(c[i]);
        }

    }

}
