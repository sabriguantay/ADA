package ar.com.ada.challenge.nasa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.challenge.nasa.entities.Temperatura;

/**
 * TemperaturaRepository
 */
@Repository
public interface TemperaturaRepository extends JpaRepository<Temperatura, Integer>{

    
}