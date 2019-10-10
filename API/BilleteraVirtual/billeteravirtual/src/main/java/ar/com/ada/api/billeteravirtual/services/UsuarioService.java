package ar.com.ada.api.billeteravirtual.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.billeteravirtual.repo.UsuarioRepository;
import ar.com.ada.api.billeteravirtual.security.Crypto;
import ar.com.ada.api.billeteravirtual.entities.*;
import ar.com.ada.api.billeteravirtual.excepciones.PersonaEdadException;

/**
 * UsuarioService
 */
@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepo;

    @Autowired
    BilleteraService billeteraService;

    @Autowired
    PersonaService personaService;

    
    public void save(Usuario usuario){
        usuarioRepo.save(usuario);
    }
    
    public List<Usuario> getUsuarios() {
        return usuarioRepo.findAll();
    }

   

    public Usuario buscarPorEmail(String email) {
        return usuarioRepo.findByEmail(email);
    }

    public Usuario buscarPorId(int id) {
        Optional<Usuario> u = usuarioRepo.findById(id);

        if (u.isPresent())
            return u.get();
        return null;
    }

    public int alta(String nombre, String dni, String email, int edad, String password, String moneda)throws PersonaEdadException {
        Persona p = new Persona();
        p.setNombre(nombre);
        p.setDni(dni);
        p.setEmail(email);
        p.setEdad(edad);
        
        Usuario u = new Usuario();
        u.setUserName(p.getEmail());
        u.setUserEmail(p.getEmail());

        String passwordEnTextoClaro;
        String passwordEncriptada;
        //String passwordEnTextoClaroDesencriptado;

        passwordEnTextoClaro = password;
        passwordEncriptada = Crypto.encrypt(passwordEnTextoClaro, u.getUserName());
        

        u.setPassword(passwordEncriptada);
        p.setUsuario(u);
        personaService.save(p);

        Billetera b = new Billetera(p);
        
        Cuenta c = new Cuenta(b, moneda);

        c.setBilletera(b);

        billeteraService.save(b);

        return u.getUsuarioId();
    }

    }
    
