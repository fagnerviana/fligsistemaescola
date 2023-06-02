package controller.helper;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import modelo.Usuario;
import views.CadastroAlunoView;
import views.CadastroFuncionariosView;

public class CadastroFuncionarioHelper {
	
	private final CadastroFuncionariosView view;
	
	
	public CadastroFuncionarioHelper(CadastroFuncionariosView view) {
		this.view = view;
		
	}

	public DefaultTableModel preencherTabela(List<Usuario> funcionarios) {
		
	//Um novo modelo para receber a tabela da view cadastroAluno	
	DefaultTableModel tableDadosFuncionarios = (DefaultTableModel) view.getTableDadosFuncionarios().getModel();
	tableDadosFuncionarios.setNumRows(0);
	
	//Percorrer a lista preenchendo o table model
	
	for (Usuario funcionario : funcionarios) {
		
		tableDadosFuncionarios.addRow(new Object[]{
				funcionario.getNome(),
				funcionario.getLogin(),
				funcionario.getSenha(),
				funcionario.getTurmas()
		});
	
	 }
	
	return tableDadosFuncionarios;
	
	}
}
