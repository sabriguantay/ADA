package ar.com.ada.api.billeteravirtual.repo;

import java.util.List;

import ar.com.ada.api.billeteravirtual.entities.Usuario;

/**
 * UsuarioRepository
 */
public class UsuarioRepository extends JpaRepository<Usuario, Integer>  {

	public List<Usuario> findAll() {
		return null;
	}



    
}