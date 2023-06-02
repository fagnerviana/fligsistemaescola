package controller;

import java.util.List;

import controller.helper.CadastroAlunoHelper;
import controller.helper.CadastroFuncionarioHelper;
import modelo.Usuario;
import modelo.enums.TipoUsuario;
import persistencia.UsuarioDao;
import views.CadastroAlunoView;
import views.CadastroFuncionariosView;

public class CadastroFuncionarioController {

	private final CadastroFuncionariosView view;
	private final CadastroFuncionarioHelper helper;

	public CadastroFuncionarioController(CadastroFuncionariosView view) {
		this.view = view;
		this.helper = new CadastroFuncionarioHelper(view);

	}

	public List<Usuario> buscarAlunoTurma() {

		UsuarioDao dao = new UsuarioDao();
		List<Usuario> admLista = dao.findAllPorTipo("ADMINISTRADOR");

		return admLista;
	}

	public List<Usuario> atualizaTabela() {
		// Buscar uma lista com os alunos no banco de dados
		UsuarioDao user = new UsuarioDao();
		List<Usuario> administrador = user.findAllPorTipo(TipoUsuario.ADMINISTRADOR.toString());

		return administrador;

	}

}
