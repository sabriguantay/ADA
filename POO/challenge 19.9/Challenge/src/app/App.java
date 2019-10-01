package app;

public class App {
    public static void main(String[] args) throws Exception {
       int a = 0;
       a = 5;
       cambiar(a);
       System.out.println(a);
    }
                                        // este parametro es un primitivo
    public static void cambiar(int b){ //el parametro es un copia que se guarda en memoria RAM en otro espacio
        b = 8;                          //se cambia una copia de "a".
                                        //despues de ejecutarse, la copia se elimina y queda a=5.
    }

    //Cuando se ejecuta esto, en memoria RAM se va a guardar un espacio que tiene "a" 
}   //cuando se pasa un parametro por valor, se pasa una copia de la variable "a"
    //Esto sucede solo si es primitivo (int)
