package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;

public class CadastroTurma extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroTurma frame = new CadastroTurma();
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
	public CadastroTurma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPerodo = new JLabel("Per\u00EDodo:");
		lblPerodo.setBounds(208, 49, 46, 14);
		contentPane.add(lblPerodo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Manh\u00E3");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(250, 45, 63, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnTarde = new JRadioButton("Tarde");
		buttonGroup.add(rdbtnTarde);
		rdbtnTarde.setBounds(250, 70, 63, 23);
		contentPane.add(rdbtnTarde);
		
		JRadioButton rdbtnNoite = new JRadioButton("Noite");
		buttonGroup.add(rdbtnNoite);
		rdbtnNoite.setBounds(323, 45, 57, 23);
		contentPane.add(rdbtnNoite);
		
		JLabel lblProfessor = new JLabel("Professor:");
		lblProfessor.setBounds(27, 127, 63, 14);
		contentPane.add(lblProfessor);
		
		JLabel lblMatria = new JLabel("Mat\u00E9ria:");
		lblMatria.setBounds(329, 127, 63, 14);
		contentPane.add(lblMatria);
		
		JLabel lblProfessor_1 = new JLabel("Professor:");
		lblProfessor_1.setBounds(27, 152, 63, 14);
		contentPane.add(lblProfessor_1);
		
		JLabel lblMatria_1 = new JLabel("Mat\u00E9ria:");
		lblMatria_1.setBounds(329, 152, 63, 14);
		contentPane.add(lblMatria_1);
		
		JLabel lblProfessor_2 = new JLabel("Professor:");
		lblProfessor_2.setBounds(27, 177, 63, 14);
		contentPane.add(lblProfessor_2);
		
		JLabel lblMatria_2 = new JLabel("Mat\u00E9ria:");
		lblMatria_2.setBounds(329, 177, 63, 14);
		contentPane.add(lblMatria_2);
		
		JLabel lblProfessor_3 = new JLabel("Professor:");
		lblProfessor_3.setBounds(27, 202, 63, 14);
		contentPane.add(lblProfessor_3);
		
		JLabel lblMatria_3 = new JLabel("Mat\u00E9ria:");
		lblMatria_3.setBounds(329, 202, 63, 14);
		contentPane.add(lblMatria_3);
		
		textField = new JTextField();
		textField.setBounds(112, 46, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(112, 123, 174, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(112, 148, 174, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(112, 173, 174, 22);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(112, 198, 174, 22);
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro de turmas");
		lblNewLabel_1.setBounds(10, 11, 142, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(402, 36, 89, 23);
		contentPane.add(btnNovo);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(402, 70, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(402, 104, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(402, 138, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(402, 173, 89, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblNewLabel = new JLabel("Curso:");
		lblNewLabel.setBounds(27, 49, 34, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Turma:");
		lblNewLabel_2.setBounds(27, 74, 34, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(112, 74, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblCargaHoraria = new JLabel("Carga Horaria:");
		lblCargaHoraria.setBounds(27, 102, 73, 14);
		contentPane.add(lblCargaHoraria);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(112, 99, 86, 20);
		contentPane.add(textField_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 36, 371, 200);
		contentPane.add(panel);
	}
}
