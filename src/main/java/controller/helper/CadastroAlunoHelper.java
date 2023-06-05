package controller.helper;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import modelo.Usuario;
import views.CadastroAlunoView;

public class CadastroAlunoHelper {
	
	private final CadastroAlunoView view;
	
	
	public CadastroAlunoHelper(CadastroAlunoView view) {
		this.view = view;
		
	}

	public DefaultTableModel preencherTabela(List<Usuario> alunos) {
		
	//Um novo modelo para receber a tabela da view cadastroAluno	
	DefaultTableModel tabelaAlunos = (DefaultTableModel) view.getTabelaDados().getModel();
	tabelaAlunos.setNumRows(0);
	
	//Percorrer a lista preenchendo o table model
	
	for (Usuario usuario : alunos) {
		
		tabelaAlunos.addRow(new Object[]{
				usuario.getNome(),
				usuario.getLogin(),
				usuario.getSenha(),
				usuario.getTurmas()
		});
	
	 }
	
	return tabelaAlunos;
	
	}
}
