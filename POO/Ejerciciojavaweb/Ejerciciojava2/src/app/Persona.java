
package app;

/**
 * Persona
 */
public class Persona {
  
private final static char SEXO_DEF = 'H';
 
private String nombre;
private int edad;
private String DNI;
private char sexo;
private double peso;
private double altura;


public Persona() {
    this.nombre = "";
    this.sexo = SEXO_DEF;
    this.edad = 0;
    this.altura= 0;
    this.peso = 0;
}

public Persona(String nombre, int edad, char sexo) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;

}

public Persona(String nombre, int edad, char sexo, double peso, double altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
    this.altura = altura;
    this.sexo = sexo;

    comprobarSexo();
}


public boolean esMayorDeEdad() {
    boolean mayor_de_edad = false;
    if (edad >= 18) {
        mayor_de_edad = true;
    }
    return mayor_de_edad;
}



public boolean  comprobarSexo(){
    boolean esMujer_Hombre= true;
    if (sexo == 'H'){
        esMujer_Hombre = false;

    }
    return esMujer_Hombre;

}

 public void getNombre (String nombre){
     this.nombre = nombre;
 }
    public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public void setSexo(char sexo) {
    this.sexo = sexo;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public void setAltura(double altura) {
    this.altura = altura;
}



public String toString() {
    String sexo;
    if (this.sexo == 'H') {
        sexo = "hombre";
    } else {
        sexo = "mujer";
    }
    return "Informacion de la persona:\n"
            + "Nombre: " + nombre + "\n"
            + "Sexo: " + sexo + "\n"
            + "Edad: " + edad + " años\n"
            + "DNI: " + DNI + "\n"
            + "Peso: " + peso + " kg\n"
            + "Altura: " + altura + " metros\n";
}

}

