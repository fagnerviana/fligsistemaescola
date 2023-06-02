package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.CadastroFuncionarioController;
import modelo.Usuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroFuncionariosView extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private JPasswordField passwordSenha;
	private CadastroFuncionarioController controller;
	private JTable tableDadosFuncionarios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionariosView frame = new CadastroFuncionariosView();
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
	public CadastroFuncionariosView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 523, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFuncao = new JLabel("Fun\u00E7\u00E3o:");
		lblFuncao.setBounds(16, 44, 46, 14);
		contentPane.add(lblFuncao);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Diretor(a)", "Vice Diretor(a)", "Secretario(a)",
				"Recepcionista", "Professor(a)", "Aux. de Classe" }));
		comboBox.setBounds(72, 40, 269, 22);
		contentPane.add(comboBox);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(16, 84, 46, 14);
		contentPane.add(lblNome);

		JLabel lblLogin = new JLabel("Email:");
		lblLogin.setBounds(16, 127, 46, 14);
		contentPane.add(lblLogin);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(16, 168, 46, 14);
		contentPane.add(lblSenha);

		textNome = new JTextField();
		textNome.setBounds(72, 81, 269, 20);
		contentPane.add(textNome);
		textNome.setEditable(false);
		textNome.setColumns(10);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(72, 124, 269, 20);
		contentPane.add(textEmail);

		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(72, 165, 269, 20);
		contentPane.add(passwordSenha);

		JLabel lblCDFuncionarios = new JLabel("Cadastro de Funcionarios");
		lblCDFuncionarios.setBounds(16, 11, 169, 14);
		contentPane.add(lblCDFuncionarios);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 34, 377, 170);
		contentPane.add(panel);

		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setEnabled(true);
			}
		});
		btnNovo.setBounds(10, 215, 89, 23);
		contentPane.add(btnNovo);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(113, 215, 89, 23);
		btnSalvar.setEnabled(false);
		contentPane.add(btnSalvar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(410, 215, 89, 23);
		btnExcluir.setEnabled(false);
		contentPane.add(btnExcluir);

		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(212, 215, 89, 23);
		btnEditar.setEnabled(false);
		contentPane.add(btnEditar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(311, 215, 89, 23);
		btnCancelar.setEnabled(false);
		contentPane.add(btnCancelar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 252, 489, 178);
		contentPane.add(scrollPane);

		tableDadosFuncionarios = new JTable();
		tableDadosFuncionarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnSalvar.setEnabled(true);
				btnEditar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);
			}
		});
		controller.atualizaTabela();
		for (Usuario user : controller.atualizaTabela())
			tableDadosFuncionarios.setModel(new DefaultTableModel(
					new Object[][] { { user.getNome(), user.getLogin(), user.getSenha(), user.getTurmas() }, },
					new String[] { "Nome", "Email", "Senha", "Turma" }) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				boolean[] columnEditables = new boolean[] { true, false, true, true };

				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});

		scrollPane.setViewportView(tableDadosFuncionarios);

	}

	public JTable getTableDadosFuncionarios() {
		return tableDadosFuncionarios;
	}

	public void setTableDadosFuncionarios(JTable tableDadosFuncionarios) {
		this.tableDadosFuncionarios = tableDadosFuncionarios;
	}
}
