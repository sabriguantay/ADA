import java.util.*;

/**
 * Ejercicio07
 */
public class Ejercicio07 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int cantHoras;
        int tarifaTotal;

        System.out.println("Ingrese la cantidad de horas");
        cantHoras = Teclado.nextInt();

        switch (cantHoras) {
        case 1:
        case 2:
            tarifaTotal = cantHoras * 5;

            break;

        case 3:
        case 4:
        case 5:
            tarifaTotal = cantHoras * 4;
            break;
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
            tarifaTotal = cantHoras * 3;
            break;

        default:
            tarifaTotal = cantHoras * 2;
            break;
        }

        System.out.println("El monto de la tarifa es: " + tarifaTotal);
    }

}
