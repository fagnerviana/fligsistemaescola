package controller;

import java.awt.event.ActionListener;

import views.CadastroAlunoView;
import views.AlunosVSMateriaVIew;
import views.TelaAdministradorView;

public class TelaAdministradorController {

	private final TelaAdministradorView view;

	public TelaAdministradorController(TelaAdministradorView view) {
		this.view = view;
	}

	public void navegarParaCadastroAluno() {
		CadastroAlunoView cadastroALuno = new CadastroAlunoView();
		cadastroALuno.setVisible(true);
	}

	public void navegarParaCadastroTurma() {
		AlunosVSMateriaVIew CadastroTurma = new AlunosVSMateriaVIew();
		CadastroTurma.setVisible(true);
	}

}
