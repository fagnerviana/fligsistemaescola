package controller;

import java.util.List;

import controller.helper.CadastroAlunoHelper;
import modelo.Usuario;
import modelo.enums.TipoUsuario;
import persistencia.UsuarioDao;
import views.CadastroAlunoView;

public class CadastroAlunoController {
	
	private final CadastroAlunoView view;
	private final CadastroAlunoHelper helper;
	
	
	public CadastroAlunoController(CadastroAlunoView view) {
		this.view = view;
		this.helper = new CadastroAlunoHelper(view);
		
	}
	
	
	public List<Usuario> buscarAlunoTurma() {
	
		UsuarioDao dao = new UsuarioDao();
		List<Usuario> alunoLista= dao.findAllPorTipo("ALUNO");
	
		return alunoLista;
	}

	public void atualizaTabelaOld() {
		//Buscar uma lista com os alunos no banco de dados
		UsuarioDao user = new UsuarioDao();
		List<Usuario> alunos = user.findAllPorTipo(TipoUsuario.ALUNO.toString());
		
		//Exibir na view
		helper.preencherTabela(alunos);
		
		
	}
	
	public List<Usuario> atualizaTabela() {
		//Buscar uma lista com os alunos no banco de dados
		UsuarioDao user = new UsuarioDao();
		List<Usuario> alunos = user.findAllPorTipo(TipoUsuario.ALUNO.toString());
		
		
		return alunos;
		
		
	}
	
}
