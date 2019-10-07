package ar.com.ada.api.billeteravirtual.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.billeteravirtual.entities.Billetera;
import ar.com.ada.api.billeteravirtual.services.BilleteraService;

/**
 * BilleteraController
 */
@RestController
public class BilleteraController {

    @Autowired
    BilleteraService billeteraService;


    @GetMapping("/agregar/dinero")
    public Billetera agregarDinero() {
        // return ;
    }


    @GetMapping("/transferir")
    public Billetera transferir() {
        // return ;
    }

    @GetMapping("/consultar/saldoDisponible")
    public Billetera consultarSaldo() {

        return


    }

}