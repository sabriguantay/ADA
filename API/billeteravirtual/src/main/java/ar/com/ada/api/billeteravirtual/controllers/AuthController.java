package ar.com.ada.api.billeteravirtual.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.billeteravirtual.entities.*;
import ar.com.ada.api.billeteravirtual.excepciones.PersonaEdadException;
import ar.com.ada.api.billeteravirtual.models.request.*;
import ar.com.ada.api.billeteravirtual.models.response.*;
import ar.com.ada.api.billeteravirtual.security.jwt.JWTTokenUtil;
import ar.com.ada.api.billeteravirtual.services.*;

/**
 * AuthController
 */
@RestController
public class AuthController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    private JWTTokenUtil jwtTokenUtil;

    @Autowired
    private JWTUserDetailsService userDetailsService;

    @PostMapping("auth/register")
    public RegistrationResponse postRegisterUser(@RequestBody RegistrationRequest req) 
    throws PersonaEdadException {
        RegistrationResponse r = new RegistrationResponse();

        int usuarioId = usuarioService.crearUsuario(req.fullName, req.dni, req.edad, req.email, req.password);
        
        r.isOk = true;
        r.message = "Te registraste con exitoooo";
        r.usuarioId = usuarioId;
        return r;
    }

    @PostMapping("auth/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody LoginRequest authenticationRequest)
    throws Exception 
    {
        usuarioService.login(authenticationRequest.username, authenticationRequest.password);

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.username);
        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));

    }
}

}