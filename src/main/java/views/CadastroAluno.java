package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;

public class CadastroAluno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAluno frame = new CadastroAluno();
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
	public CadastroAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		textField = new JTextField();
		textField.setBounds(76, 51, 325, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(76, 76, 325, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(76, 101, 325, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(76, 126, 325, 20);
		contentPane.add(textField_3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 39, 411, 117);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro de Alunos");
		lblNewLabel_1.setBounds(10, 11, 113, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(449, 161, 83, 23);
		contentPane.add(btnSalvar);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(449, 39, 83, 23);
		contentPane.add(btnNovo);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(449, 70, 83, 23);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(449, 129, 83, 23);
		contentPane.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(449, 100, 83, 23);
		contentPane.add(btnCancelar);
	}
}
