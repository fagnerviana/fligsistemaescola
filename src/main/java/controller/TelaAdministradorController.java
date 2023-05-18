package controller;

import java.awt.event.ActionListener;

import views.CadastroAluno;
import views.CadastroTurma;
import views.TelaAdministrador;

public class TelaAdministradorController {
	
	private final TelaAdministrador view;
	
	public TelaAdministradorController(TelaAdministrador view) {
		this.view=view;
	}
	
	public void navegarParaCadastroAluno() {
		CadastroAluno cadastroALuno = new CadastroAluno();
		cadastroALuno.setVisible(true);
	}
	
	public void navegarParaCadastroTurma() {
		CadastroTurma CadastroTurma = new CadastroTurma();
		CadastroTurma.setVisible(true);
	}
	
	

}
