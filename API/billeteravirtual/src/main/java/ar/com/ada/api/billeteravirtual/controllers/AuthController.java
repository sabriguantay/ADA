package ar.com.ada.api.billeteravirtual.controllers;

import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.billeteravirtual.entities.*;
import ar.com.ada.api.billeteravirtual.excepciones.PersonaEdadException;
import ar.com.ada.api.billeteravirtual.models.request.RegistrationRequest;
import ar.com.ada.api.billeteravirtual.models.response.RegistrationResponse;;

/**
 * AuthController
 */
@RestController
public class AuthController {

    @PostMapping("auth/register")
    public RegistrationResponse postRegisterUser(@RequestBody RegistrationRequest req) throws PersonaEdadException {
        RegistrationResponse r = new RegistrationResponse();
        //aca creamos la persona y el usuario a traves del service.
        
        Persona persona = new Persona();
        persona.setEmail(req.email);   
        persona.setNombre(req.fullName); 
        persona.setDni(req.dni);
        persona.setEdad(req.edad);

        Usuario usuario = new Usuario();
        usuario.setPassword(req.password);


        //Billetera billetera = new Billetera();


        r.isOk = true;
        r.message = "Te registraste con exito";
        return r;

    }




    

}