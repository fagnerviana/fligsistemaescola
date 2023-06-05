package controller;


import views.CadastroAlunoView;
import views.TelaAdministradorView;

public class TelaAdministradorController {
	
	private final TelaAdministradorView view;
	
	public TelaAdministradorController(TelaAdministradorView view) {
		this.view=view;
	}
	
	public void navegarParaCadastroAluno() {
		CadastroAlunoView cadastroALuno = new CadastroAlunoView();
		cadastroALuno.setVisible(true);
	}
	
	/*
	 * public void navegarParaCadastroTurma() { Cadastro CadastroTurma = new
	 * CadastroTurma(); CadastroTurma.setVisible(true); }
	 */
	
	

}
