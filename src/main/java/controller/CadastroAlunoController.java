package controller;

import java.util.List;

import modelo.Usuario;
import modelo.enums.TipoUsuario;
import persistencia.UsuarioDao;
import views.CadastroAluno;

public class CadastroAlunoController {
	
	private final CadastroAluno view;
	
	
	public CadastroAlunoController(CadastroAluno view) {
		this.view = view;
		
	}
	
	
	public List<Usuario> buscarAlunoTurma() {
	
		UsuarioDao dao = new UsuarioDao();
		List<Usuario> alunoLista= dao.findAllPorTipo("ALUNO");
	
		return alunoLista;
	}
	
}
