package controller;

import java.awt.event.ActionListener;
import java.util.List;

import controller.helper.CadastroAlunoHelper;
import modelo.Usuario;
import modelo.enums.TipoUsuario;
import persistencia.UsuarioDao;
import views.AlunosVSMateriaVIew;
import views.CadastroAlunoView;
import views.CadastroMateriaView;

public class AlunosVSMateriaController {

	private final AlunosVSMateriaVIew view;

	public AlunosVSMateriaController(AlunosVSMateriaVIew view) {
		this.view = view;
	}

}
