package persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Integer>  {
	
		
	
	
}
