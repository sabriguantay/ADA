package ar.com.ada.billeteravirtual;

import java.util.List;
import java.util.logging.Level;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * UsuarioManager
 */
public class UsuarioManager {
    protected SessionFactory sessionFactory;

    protected void setup() {

        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings
                                                                                                  // from
                                                                                                  // hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw ex;
        }
        
    }

    protected void exit() {
        sessionFactory.close();
    }

    protected void create(Usuario u) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(u);
  
        session.getTransaction().commit();
        session.close();
    }

    public Usuario read(int usuarioId) {
        Session session = sessionFactory.openSession();

        Usuario usuario = session.get(Usuario.class, usuarioId);

        session.close();

        return usuario;
    }


    protected void update(Usuario usuario) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(usuario);

        session.getTransaction().commit();
        session.close();
    }

    protected void delete(Usuario usuario){

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(usuario);

        session.getTransaction().commit();
        session.close();
    }


    /**
     * Este metodo en la vida real no debe existir ya qeu puede haber miles de usuarios
     * @return
     */
    public List<Usuario> buscarTodas() {

        Session session = sessionFactory.openSession();

        ///NUNCA HARCODEAR SQLs nativos en la aplicacion.
        //ESTO es solo para nivel educativo
        Query query = session.createNativeQuery("SELECT * FROM usuario", Usuario.class);

        List<Usuario> todas = query.getResultList();

        return todas;

        

    }

    /**
     * Busca una lista de personas por el nombre completo
     * Esta armado para que se pueda generar un SQL Injection y mostrar commo NO debe programarse.
     * @param nombre
     * @return
     */
    public List<Usuario> buscarPor(String username) {

        Session session = sessionFactory.openSession();

        //SQL Injection vulnerability exposed.
        //Deberia traer solo aquella del nombre y con esto demostrarmos que trae todas si pasamos
        //como nombre: "' or '1'='1"
        Query query = session.createNativeQuery("SELECT * FROM usuario where nombre = '"+username+"'", Usuario.class);

        List<Usuario> usuarios = query.getResultList();

        return usuarios;

        

    }
    
}