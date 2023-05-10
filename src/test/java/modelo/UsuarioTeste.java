package modelo;

import org.junit.Test;

import modelo.enums.TipoUsuario;
import persistencia.UsuarioDao;

public class UsuarioTeste {

	public UsuarioDao dao = new UsuarioDao();
	public Usuario user = new Usuario();

	@Test 
	public void salvarUsuario() {
	user.setNome("Israel");
	user.setLogin("israel@email.com"); 
	user.setSenha("123456");
	user.setTipoUsuario(TipoUsuario.ADMINISTRADOR); 
	dao.SalvarUsuario(user); }
	

	

}
