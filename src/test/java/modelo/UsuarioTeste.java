package modelo;

import java.util.List;

import org.junit.Test;

import modelo.enums.TipoUsuario;
import persistencia.UsuarioDao;

public class UsuarioTeste {

	public UsuarioDao dao = new UsuarioDao();
	public Usuario user = new Usuario();
	
	
	
    //Salvar usuario - teste ok - 12/05/2023 - Fagner 
	//@Test 
	public void salvarUsuario() {
	user.setNome("Editar usuario");
	user.setLogin("editar@email.com"); 
	user.setSenha("123456");
	user.setTipoUsuario(TipoUsuario.ALUNO); 
	dao.SalvarUsuario(user); 
	
	}
	
	//@Test
	public void findAll() {
		System.out.println(dao.findAll());
		
	}
	//@Test
	public void validarlogin() {
		System.out.println(dao.validarLogin("neymar@email.com", "123456"));
	}
	
	
	//@Test
	public void findAllProfessores() {
		System.out.println(dao.findAllPorTipo("PROFESSOR"));
	}
	//@Test
	public void findAllAlunos() {
		System.out.println(dao.findAllPorTipo("ALUNO"));
	
	}
	
	@Test
	public void findAllAdm() {
		System.out.println(dao.findAllPorTipo("ADMINISTRADOR"));
	
	}
		
			
	
	//@Test
	public void findAllAdministradores() {
		
	}
	
}
