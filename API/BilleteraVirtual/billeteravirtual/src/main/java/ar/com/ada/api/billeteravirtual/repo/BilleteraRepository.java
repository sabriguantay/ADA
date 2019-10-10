package ar.com.ada.api.billeteravirtual.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.billeteravirtual.entities.*;

/**
 * BilleteraRepository
 */
public interface BilleteraRepository extends JpaRepository <Billetera, Integer> {
    public Billetera findByPersona(Persona p); 
    public Billetera findById(Billetera id);  

 
}   