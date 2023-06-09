package views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import controller.CadastroAlunoController;
import modelo.Usuario;

public class CadastroAlunoView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldEmail;
	private JTextField textFieldTurma;
	private JTable tabelaDados;
	private JPasswordField passwordField;
	private CadastroAlunoController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAlunoView frame = new CadastroAlunoView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroAlunoView() {
		
		controller = new CadastroAlunoController(this);
		//iniciar();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 567, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(76, 101, 325, 20);
		passwordField.setEditable(false);
		contentPane.add(passwordField);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(28, 54, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(28, 79, 46, 14);
		contentPane.add(lblEmail);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(28, 104, 46, 14);
		contentPane.add(lblSenha);

		JLabel lblMateria = new JLabel("Turma");
		lblMateria.setBounds(28, 129, 46, 14);
		contentPane.add(lblMateria);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(76, 51, 325, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		textFieldNome.setEditable(false);

		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(76, 76, 325, 20);
		textFieldEmail.setEditable(false);
		contentPane.add(textFieldEmail);

		textFieldTurma = new JTextField();
		textFieldTurma.setColumns(10);
		textFieldTurma.setBounds(76, 126, 325, 20);
		textFieldTurma.setEditable(false);
		contentPane.add(textFieldTurma);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 36, 539, 117);
		contentPane.add(panel);

		JLabel lblNewLabel_1 = new JLabel("Cadastro de Alunos");
		lblNewLabel_1.setBounds(10, 11, 113, 14);
		contentPane.add(lblNewLabel_1);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnSalvar, "Cadastro realizado com sucesso!");
			}
		});
		btnSalvar.setBounds(131, 161, 83, 23);
		btnSalvar.setEnabled(false);
		contentPane.add(btnSalvar);

		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				habilitaCampos();
				// habilita os bot�es de acordo a utiliza��o
				btnSalvar.setEnabled(true);
				limpaCampos();
			}
		});
		btnNovo.setBounds(28, 161, 83, 23);
		contentPane.add(btnNovo);

		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				habilitaCampos();

			}
		});
		btnEditar.setBounds(234, 161, 83, 23);
		btnEditar.setEnabled(false);
		contentPane.add(btnEditar);
		
		

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			int i = JOptionPane.showConfirmDialog(btnExcluir, "Confirmar exlu��o do registro?");
				if(i == JOptionPane.YES_OPTION) {
					//chamar o evento delete controller
				    System.out.println("Clicou em Sim");
				}
				else if(i == JOptionPane.NO_OPTION) {
				    System.out.println("Clicou em N�o");
				}
				else if(i == JOptionPane.CANCEL_OPTION) {
				    System.out.println("Clicou em Cancel");
				    
				}
			}
		});
		btnExcluir.setBounds(440, 161, 83, 23);
		btnExcluir.setEnabled(false);
		contentPane.add(btnExcluir);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpaCampos();
			}
		});
		btnCancelar.setBounds(333, 161, 89, 23);
		btnCancelar.setEnabled(false);
		contentPane.add(btnCancelar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 189, 539, 177);
		contentPane.add(scrollPane);

		tabelaDados = new JTable();
		
		tabelaDados.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mouseClicked(MouseEvent e) {
				btnEditar.setEnabled(true);
				btnCancelar.setEnabled(true);
				btnSalvar.setEnabled(true);
				btnExcluir.setEnabled(true);
				desabilitaCampos();
			}
		});
		controller.atualizaTabela();
		DefaultTableModel tabelaDados = new DefaultTableModel();
		
		for (Usuario user : controller.atualizaTabela()) {
			
		tabelaDados.addRow(new Object[] {
				user.getNome(), 
				user.getLogin(), 
				user.getSenha(),
				user.getTurmas()
				
				
		});
	  }
		JScrollPane scrollPane1 = new JScrollPane(this.tabelaDados);
        add(scrollPane1);
	}

	private void iniciar() {
		this.controller.atualizaTabela();
		
	}

	public void limpaCampos() {
		// limpeza dos campos
		textFieldNome.setText("");
		textFieldEmail.setText("");
		passwordField.setText("");
		textFieldTurma.setText("");

	}

	public void habilitaCampos() {
		// habilita os campos para edi��o
		textFieldNome.setEditable(true);
		textFieldEmail.setEditable(true);
		passwordField.setEditable(true);
		textFieldTurma.setEditable(true);

	}
	public void desabilitaCampos() {
		// habilita os campos para edi��o
		textFieldNome.setEditable(false);
		textFieldEmail.setEditable(false);
		passwordField.setEditable(false);
		textFieldTurma.setEditable(false);

	}

	public JTable getTabelaDados() {
		return tabelaDados;
	}

	public void setTabelaDados(JTable tabelaDados) {
		this.tabelaDados = tabelaDados;
	}
}
