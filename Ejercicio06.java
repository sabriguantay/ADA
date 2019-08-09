import java.util.*;

/**
 * Ejercicio06
 */
public class Ejercicio06 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int costoGramo1 = 11, costoGramo2 = 10, costoGramo3 = 12, costoGramo4 = 24, costoGramo5 = 27;
        int zona;
        double peso, costoTotal1, costoTotal2, costoTotal3, costoTotal4, costoTotal5;

        System.out.println("Ingrese el peso del paquete ");
        peso = Teclado.nextDouble();

        if (peso > 5.00) {
            System.out.println("El paquete no puede ser transportado porque supera los 5kg.");
        }

        if (peso <= 5.00) {
            System.out.print("Ingrese el nro de zona");
            zona = Teclado.nextInt();

            switch (zona) {
            case 1:

                costoTotal1 = peso * costoGramo1;
                System.out.println("El costo total de este paquete es " + costoTotal1);
                break;

            case 2:

                costoTotal2 = peso * costoGramo2;
                System.out.println("El costo total de este paquete es " + costoTotal2);
                break;

            case 3:
                costoTotal3 = peso * costoGramo3;
                System.out.println("El costo total de este paquete es " + costoTotal3);
                break;

            case 4:
                costoTotal4 = peso * costoGramo4;
                System.out.println("El costo total de este paquete es " + costoTotal4);
                break;

            case 5:
                costoTotal5 = peso * costoGramo5;
                System.out.println("El costo total de este paquete es " + costoTotal5);
                break;

            }
        }

    }
}