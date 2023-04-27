package persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import modelo.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {

	@Query("SELECT u FROM Usuario u WHERE (u.login = :login) AND (u.senha = :senha) ")
	public Usuario validarLoginSenha(@Param("login") String login, @Param("senha") String senha);

}
