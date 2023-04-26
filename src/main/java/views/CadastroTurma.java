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

public class CadastroTurma extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setBounds(100, 100, 400, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Turma:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPerodo = new JLabel("Per\u00EDodo:");
		lblPerodo.setBounds(10, 49, 46, 14);
		contentPane.add(lblPerodo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Manh\u00E3");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(60, 45, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnTarde = new JRadioButton("Tarde");
		buttonGroup.add(rdbtnTarde);
		rdbtnTarde.setBounds(60, 71, 109, 23);
		contentPane.add(rdbtnTarde);
		
		JRadioButton rdbtnNoite = new JRadioButton("Noite");
		buttonGroup.add(rdbtnNoite);
		rdbtnNoite.setBounds(60, 97, 109, 23);
		contentPane.add(rdbtnNoite);
		
		JLabel lblProfessor = new JLabel("Professor:");
		lblProfessor.setBounds(10, 127, 63, 14);
		contentPane.add(lblProfessor);
		
		JLabel lblMatria = new JLabel("Mat\u00E9ria:");
		lblMatria.setBounds(276, 127, 63, 14);
		contentPane.add(lblMatria);
		
		JLabel lblProfessor_1 = new JLabel("Professor:");
		lblProfessor_1.setBounds(10, 152, 63, 14);
		contentPane.add(lblProfessor_1);
		
		JLabel lblMatria_1 = new JLabel("Mat\u00E9ria:");
		lblMatria_1.setBounds(276, 152, 63, 14);
		contentPane.add(lblMatria_1);
		
		JLabel lblProfessor_2 = new JLabel("Professor:");
		lblProfessor_2.setBounds(10, 178, 63, 14);
		contentPane.add(lblProfessor_2);
		
		JLabel lblMatria_2 = new JLabel("Mat\u00E9ria:");
		lblMatria_2.setBounds(276, 178, 63, 14);
		contentPane.add(lblMatria_2);
		
		JLabel lblProfessor_3 = new JLabel("Professor:");
		lblProfessor_3.setBounds(10, 203, 63, 14);
		contentPane.add(lblProfessor_3);
		
		JLabel lblMatria_3 = new JLabel("Mat\u00E9ria:");
		lblMatria_3.setBounds(276, 203, 63, 14);
		contentPane.add(lblMatria_3);
		
		textField = new JTextField();
		textField.setBounds(70, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(70, 123, 174, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(70, 148, 174, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(70, 174, 174, 22);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(70, 199, 174, 22);
		contentPane.add(comboBox_3);
	}
}
