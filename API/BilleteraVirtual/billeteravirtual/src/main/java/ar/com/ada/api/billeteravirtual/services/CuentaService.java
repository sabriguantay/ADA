package ar.com.ada.api.billeteravirtual.services;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.ada.api.billeteravirtual.entities.*;
import ar.com.ada.api.billeteravirtual.repo.CuentaRepository;

/**
 * CuentaService
 */
public class CuentaService {

@Autowired 
CuentaRepository cuentaRepo;

@Autowired
BilleteraService billeteraService;

public Cuenta getCuentaPorMoneda (int billeteraId, String moneda){
    Billetera b = billeteraService.buscarPorId(billeteraId);
    for (Cuenta c = b.getCuentas()){
        if (c.getMoneda().equals(moneda)){
            return c;
        }
    }
}
}