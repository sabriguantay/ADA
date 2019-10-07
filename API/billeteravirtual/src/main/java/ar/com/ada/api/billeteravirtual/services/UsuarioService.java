package ar.com.ada.api.billeteravirtual.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.billeteravirtual.entities.Usuario;
import ar.com.ada.api.billeteravirtual.repo.UsuarioRepository;

/**
 * UsuarioService
 */
@Service
public class UsuarioService {

    
    @Autowired
    UsuarioRepository repo;

    public List<Usuario> getUsuarios() {

        return repo.findAll();
    }

    public  buscarPorUsername(String username) {

        return repo.findByUsername(username);
    }
    
    

    public Usuario buscarPorId(int id) {

        Optional<Usuario> u = repo.findById(id);
        
        if (u.isPresent())
            return u.get();
        return null;
    }

}