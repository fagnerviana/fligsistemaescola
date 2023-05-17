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
	
	/*
	public void buscarAlunoTurma() {
		UsuarioDao dao = new UsuarioDao();
		List<Usuario> user = dao.findAll(TipoUsuario.ALUNO); 
		System.out.println(user);
		
	}*/
}
