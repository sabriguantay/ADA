package ar.com.ada.api.billeteravirtual.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.ada.api.billeteravirtual.entities.*;
import ar.com.ada.api.billeteravirtual.repo.BilleteraRepository;
import ar.com.ada.api.billeteravirtual.repo.UsuarioRepository;

/**
 * BilleteraService
 */
public class BilleteraService {

    @Autowired
    BilleteraRepository repoBilletera;

    @Autowired
    UsuarioRepository repoUsuario;

    public void save(Billetera b) {
        repoBilletera.save(b);
    }

    public Billetera buscarPorId(int id) {

        Optional<Billetera> b = repoBilletera.findById(id);

        if (b.isPresent()) {
            return b.get();
        }
        return null;
    }

    public Billetera buscarPorPersona(Persona p) {

        return repoBilletera.findByPersona(p);
    }

    public Movimiento agregarMovimiento(int importe, int usuarioId, int cuentaId, String conceptoOperacion,
            String tipoOperacion) {
        
        Billetera b = repoBilletera.findByPersona(p);
        //Usuario u = new repoUsuario.fin
        Movimiento m = new Movimiento();
        m.setImporte(importe);
        m.setaUsuario(usuarioId);
        m.setCuentaDestino(cuentaId);
        m.setCuentaOrigen(cuentaId);
        m.setConceptoOperacion(conceptoOperacion);
        m.setTipoOperacion(tipoOperacion);

        return m;


    }

    public double consultarSaldo (int billeteraId, String moneda){
        Billetera b = this.buscarPorId(billeteraId);
        double saldoDisponible = 0;

        for (Cuenta c : b.getCuentas()){
            if (c.getMoneda().equals(moneda)) {
                saldoDisponible = c.getSaldo();
                
            }
        }
        return saldoDisponible;
    }



}