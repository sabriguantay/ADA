package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        Persona persona1 = new Persona ("Sabrina", 22, 'F');
        Persona persona2 = new Persona ("Mario", 27, 'M');
        
    
        System.out.println("Is the first person over 18? " + persona1.esMayorDeEdad());
        System.out.println ( "Is the second person masculine? " + persona2.comprobarSexo());

        
    }
}