package views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AlunosVSMateriaController;
import controller.LoginSenhaController;
import controller.TelaAdministradorController;

public class TelaAdministradorView extends JFrame {

	private JPanel contentPane;
	private final TelaAdministradorController controller;
	private final LoginSenhaController controller1;
	private JMenu mnRelacionamentos;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdministradorView frame = new TelaAdministradorView();
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
	public TelaAdministradorView() {
		this.controller = new TelaAdministradorController(this);
		this.controller1 = new LoginSenhaController(null);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 732, 484);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenu mnCadastro = new JMenu("Cadastros");
		mnMenu.add(mnCadastro);
		
		JMenuItem mntmFuncionarios = new JMenuItem("Funcion\u00E1rios");
		mntmFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroFuncionariosView().setVisible(true);
			}
		});
		mnCadastro.add(mntmFuncionarios);
		
		JMenuItem mntmAlunos = new JMenuItem("Alunos");
		mntmAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroAlunoView().setVisible(true);
			}
		});
		mnCadastro.add(mntmAlunos);
		
		JMenuItem mntmMateria = new JMenuItem("Mat\u00E9rias");
		mntmMateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroMateriaView().setVisible(true);
			}
		});
		mnCadastro.add(mntmMateria);
		
		mnRelacionamentos = new JMenu("Relacionamentos");
		mnMenu.add(mnRelacionamentos);
		
		JMenuItem mntmAlunoVSMateria = new JMenuItem("Alunos X Mat\u00E9ria");
		mntmAlunoVSMateria.addActionListener(new ActionListener() {
			 
			public void actionPerformed(ActionEvent e) {
				new AlunosVSMateriaVIew().setVisible(true);
			}
		});
		mnRelacionamentos.add(mntmAlunoVSMateria);
		
		JMenuItem mntmMateriaVSProfessor = new JMenuItem("Mat\u00E9ria X Professor");
		mntmMateriaVSProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MateriaVSProfessorView().setVisible(true);
			}
		});
		mnRelacionamentos.add(mntmMateriaVSProfessor);
		
		JMenuItem mntmLogaut = new JMenuItem("Logout");
		mntmLogaut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showConfirmDialog(null, "Deseja sair?");
				System.exit(0);
				controller1.EntrarNoSistema();
				this.actionPerformed(e);
			}});
		mnMenu.add(mntmLogaut);
		
		JMenu mnConf = new JMenu("Configura\u00E7\u00F5es");
		menuBar.add(mnConf);
		
		JMenu mAjuda = new JMenu("Ajuda");
		menuBar.add(mAjuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\IS&MA\\Documents\\Projeto FLIG\\workspace\\fligsistemaescola\\src\\main\\java\\assets\\gifs-de-leitura-4.gif"));
		lblNewLabel.setBounds(282, 80, 432, 351);
		contentPane.add(lblNewLabel);
	}

}
