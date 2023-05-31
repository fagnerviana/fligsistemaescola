package controller;

import java.util.List;

import controller.helper.CadastroAlunoHelper;
import modelo.Usuario;
import modelo.enums.TipoUsuario;
import persistencia.UsuarioDao;
import views.CadastroAlunoView;
import views.CadastroMateriaView;

public class CadastroMateriaController {

	private final CadastroMateriaView view;

	public CadastroMateriaController(CadastroMateriaView view) {
		this.view = view;
	}

}
