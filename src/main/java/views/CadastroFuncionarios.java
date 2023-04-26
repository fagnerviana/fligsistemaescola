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

public class CadastroFuncionarios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionarios frame = new CadastroFuncionarios();
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
	public CadastroFuncionarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFuncao = new JLabel("Fun\u00E7\u00E3o:");
		lblFuncao.setBounds(16, 44, 46, 14);
		contentPane.add(lblFuncao);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Diretor(a)", "Vice Diretor(a)", "Secretario(a)", "Recepcionista", "Professor(a)", "Aux. de Classe"}));
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
		
		JLabel lblDisciplina = new JLabel("Disciplina:");
		lblDisciplina.setBounds(16, 210, 69, 14);
		contentPane.add(lblDisciplina);
		
		JLabel lblDataDoCadastro = new JLabel("Data de cadastro:");
		lblDataDoCadastro.setBounds(16, 249, 95, 14);
		contentPane.add(lblDataDoCadastro);
		
		textField = new JTextField();
		textField.setBounds(72, 81, 269, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(72, 124, 269, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(107, 246, 95, 20);
		contentPane.add(textField_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Portugu\u00EAs", "Matem\u00E1tica", "Hist\u00F3ria", "F\u00EDsica", "Qu\u00EDmica"}));
		comboBox_1.setBounds(72, 206, 269, 22);
		contentPane.add(comboBox_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(72, 165, 269, 20);
		contentPane.add(passwordField);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(16, 291, 95, 14);
		contentPane.add(lblTelefone);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(72, 288, 147, 20);
		contentPane.add(textField_3);
		
		JLabel lblExpiraEm = new JLabel("Expira em:");
		lblExpiraEm.setBounds(212, 249, 57, 14);
		contentPane.add(lblExpiraEm);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(267, 246, 95, 20);
		contentPane.add(textField_4);
		
		JLabel lblCDFuncionarios = new JLabel("Cadastro de Funcionarios");
		lblCDFuncionarios.setBounds(16, 11, 169, 14);
		contentPane.add(lblCDFuncionarios);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 34, 365, 285);
		contentPane.add(panel);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(415, 34, 89, 23);
		contentPane.add(btnNovo);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(415, 168, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(415, 136, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(415, 68, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(415, 102, 89, 23);
		contentPane.add(btnCancelar);
		
	}
}
