package ar.com.ada.mongo.pooflix.entities;

import java.util.*;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Peliculas")
public class Pelicula extends Contenido {

    public Pelicula (){

    }

    public boolean ganoOscar;

    public Pelicula(int anio,String genero, String nombre){
        super(anio, genero, nombre);
    }


    public List<Pelicula> peliculas = new ArrayList<Pelicula>();

    @Id
    private ObjectId _id;

    public Object get_id() {
        return null;
    }

    @Override
    public int getAnio() {
       
        return super.getAnio();
    }

    @Override
    public String getGenero() {
       
        return super.getGenero();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setAnio(int anio) {
        super.setAnio(anio);
    }

    @Override
    public void setGenero(String genero) {
        super.setGenero(genero);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public boolean isGanoOscar() {
        return ganoOscar;
    }

    public void setGanoOscar(boolean ganoOscar) {
        this.ganoOscar = ganoOscar;
    }

   

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Pelicula getAnio(int numero) {

    
        for (Pelicula p : this.peliculas) { 

            if (numero == p.anio)
                return p;
        }
        return null;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

}