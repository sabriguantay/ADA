/*package ar.com.ada.billeteravirtual;


import java.util.logging.Level;

//import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


/**
 * CoordenadaManager
 
public class CoordenadaManager {

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

    protected void create(Persona persona) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(persona);
  
        session.getTransaction().commit();
        session.close();
    }

    public Persona read(int personaId) {
        Session session = sessionFactory.openSession();

        Persona persona = session.get(Persona.class, personaId);

        session.close();

        return persona;
    }

  
    protected void update(Persona persona) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(persona);

        session.getTransaction().commit();
        session.close();
    }

    protected void delete(Persona persona) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(persona);

        session.getTransaction().commit();
        session.close();
    }


}
*/