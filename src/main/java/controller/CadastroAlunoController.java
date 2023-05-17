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
<<<<<<< HEAD
=======
	
	/*
>>>>>>> bf78a659531f2e6e05aab8b8c9af0531552a9c2f
	public void buscarAlunoTurma() {
		UsuarioDao dao = new UsuarioDao();
		List<Usuario> user = dao.findAll(TipoUsuario.ALUNO); 
		System.out.println(user);
		
<<<<<<< HEAD
	}
=======
	}*/
>>>>>>> bf78a659531f2e6e05aab8b8c9af0531552a9c2f
}
