package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MateriaVSProfessorView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTurma;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MateriaVSProfessorView frame = new MateriaVSProfessorView();
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
	public MateriaVSProfessorView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 523, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Turma:");
		lblNewLabel.setBounds(27, 49, 46, 14);

		contentPane.add(lblNewLabel);

		JLabel lblPerodo = new JLabel("Per\u00EDodo:");
		lblPerodo.setBounds(198, 49, 46, 14);
		contentPane.add(lblPerodo);

		JRadioButton rdbtnManha = new JRadioButton("Manh\u00E3");
		buttonGroup.add(rdbtnManha);
		rdbtnManha.setBounds(250, 45, 109, 23);

		contentPane.add(rdbtnManha);

		JRadioButton rdbtnTarde = new JRadioButton("Tarde");
		buttonGroup.add(rdbtnTarde);
		rdbtnTarde.setBounds(250, 70, 109, 23);

		contentPane.add(rdbtnTarde);

		JRadioButton rdbtnNoite = new JRadioButton("Noite");
		buttonGroup.add(rdbtnNoite);
		rdbtnNoite.setBounds(250, 96, 109, 23);

		contentPane.add(rdbtnNoite);

		JLabel lblProfessor = new JLabel("Professor:");
		lblProfessor.setBounds(27, 127, 63, 14);
		contentPane.add(lblProfessor);

		JLabel lblProfessor_1 = new JLabel("Professor:");
		lblProfessor_1.setBounds(27, 152, 63, 14);
		contentPane.add(lblProfessor_1);

		JLabel lblProfessor_2 = new JLabel("Professor:");
		lblProfessor_2.setBounds(27, 177, 63, 14);
		contentPane.add(lblProfessor_2);

		JLabel lblProfessor_3 = new JLabel("Professor:");
		lblProfessor_3.setBounds(27, 202, 63, 14);
		contentPane.add(lblProfessor_3);

		textFieldTurma = new JTextField();
		textFieldTurma.setBounds(83, 46, 86, 20);
		contentPane.add(textFieldTurma);
		textFieldTurma.setEditable(false);
		textFieldTurma.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(112, 123, 174, 22);
		contentPane.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(112, 148, 174, 22);
		comboBox_1.setEditable(false);
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

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 36, 495, 200);
		contentPane.add(panel);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(112, 245, 89, 23);
		btnSalvar.setEnabled(false);
		contentPane.add(btnSalvar);

		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnEditar.setBounds(210, 245, 89, 23);
		btnEditar.setEnabled(false);
		contentPane.add(btnEditar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//comboBox.setToolTipText(null);
			}
		});
		btnCancelar.setBounds(309, 245, 89, 23);
		btnCancelar.setEnabled(false);
		contentPane.add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(btnExcluir, "Confirmar exlução do registro?");
				if(i == JOptionPane.YES_OPTION) {
					//chamar o evento delete controller
				    System.out.println("Clicou em Sim");
				}
				else if(i == JOptionPane.NO_OPTION) {
				    System.out.println("Clicou em Não");
				}
				else if(i == JOptionPane.CANCEL_OPTION) {
				    System.out.println("Clicou em Cancel");
				    
				}
			}
		});
		btnExcluir.setBounds(408, 245, 89, 23);
		btnExcluir.setEnabled(false);
		contentPane.add(btnExcluir);


		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				habilitaCampos();
				btnSalvar.setEnabled(true);

			}
		});
		btnNovo.setBounds(10, 245, 89, 23);
		contentPane.add(btnNovo);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 279, 495, 177);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnCancelar.setEnabled(true);
				btnEditar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnSalvar.setEnabled(true);
				textFieldTurma.setEditable(false);
			}
		});
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, },
				new String[] { "Turma", "Periodo", "Professor", "Materia" }));
		scrollPane.setViewportView(table);
	
	}

	public void habilitaCampos() {
		textFieldTurma.setEditable(true);
	
	}
}
