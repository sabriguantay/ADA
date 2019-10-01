package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando Buques y puertos");

        Buque barquito = Buque.NuevoBuqueCargado();

        for (Contenedor contenedorcito : barquito.losContenedores) {
            switch (contenedorcito.puertoArribo.nroPuerto) {
            case 1:
                Puerto.BuscarPuerto(1).contenedoresARecibir.add(contenedorcito);

                break;

            case 2:
                Puerto.BuscarPuerto(2).contenedoresARecibir.add(contenedorcito);
                break;

            case 3:
                Puerto.BuscarPuerto(3).contenedoresARecibir.add(contenedorcito);
                break;
            }
        }
        //por cd puerto se imprime sus cantidades
        for (Puerto puertito : Puerto.PuertosDelMundo) {
            System.out.println("El puerto "+ puertito.nombre + " recibira " + puertito.contenedoresARecibir.size());
            
        }

        //imprimo el peso del buque
        System.out.println("El peso del barco " + barquito.nombre + " es " +  barquito.calcularPeso());
    
    //imprimo el contenedor con peso maximo
    Contenedor elContenedorMasPesado= barquito.getContenedorMaximo();
        System.out.println("El contenedor mas pesado es " + elContenedorMasPesado.idContenedor
        + " Cuyo peso es " + elContenedorMasPesado.peso);


    
    }
}