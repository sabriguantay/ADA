package ar.com.ada.api.billeteravirtual.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.billeteravirtual.entities.*;
import ar.com.ada.api.billeteravirtual.models.request.MovimientoRequest;
import ar.com.ada.api.billeteravirtual.models.response.MovimientoResponse;
import ar.com.ada.api.billeteravirtual.services.BilleteraService;

/**
 * BilleteraController
 */
@RestController
public class BilleteraController {

    @Autowired
    BilleteraService billeteraService;

    @PostMapping("billetera/{id}/movimientos")
    public MovimientoResponse postMovimiento(@RequestBody MovimientoRequest req) {
        MovimientoResponse r = new MovimientoResponse();

        Movimiento m = billeteraService.agregarMovimiento(req.importe, req.aUsuario, req.cuentaDestino,
                req.conceptoOperacion, req.tipoOperacion);
        r.isOk = true;
        r.message = "Operacion realizada con éxito";

        return r;

    }
}

/*
 * @GetMapping("/billeteras") public List<Billetera> getBilleteras(){
 * List<Billetera> b = billeteraService.getBilleteras(); return b; }
 * 
 * @GetMapping("/billeteras/{id}/saldos") public Billetera
 * GetBilleteraById(@PathVariable int id)
 * 
 * @GetMapping("/billeteras/{id}/movimientos") public Billetera
 * GetBilleteraById(@PathVariable int id)
 * 
 * @PostMapping("/billeteras/{id}/cuentas/{idC}") public Billetera
 * GetBilleteraById(@PathVariable int id)
 * 
 * @PostMapping("/billeteras/{id}/usuarios/{idU}")
 * 
 * @PostMapping("/billeteras/{id}/billeteras/{idB}")
 */
