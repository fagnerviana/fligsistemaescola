package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.helper.LoginSenhaHelper;
import jakarta.persistence.Query;
import modelo.Usuario;
import modelo.enums.TipoUsuario;
import persistencia.UsuarioDao;
import util.JpaUtil;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
<<<<<<< HEAD
=======
import javax.swing.JOptionPane;

>>>>>>> bf78a659531f2e6e05aab8b8c9af0531552a9c2f
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.persistence.EntityManager;
import javax.swing.ImageIcon;
<<<<<<< HEAD
=======
import javax.swing.JList;
>>>>>>> bf78a659531f2e6e05aab8b8c9af0531552a9c2f

public class TelaAdministrador extends JFrame {

	private EntityManager em = JpaUtil.getEntityManager();
	private JPanel contentPane;
	private LoginSenhaHelper helper;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdministrador frame = new TelaAdministrador();
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
	public TelaAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 484);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
<<<<<<< HEAD
=======
<<<<<<<< HEAD:src/main/java/views/TelaPrincipal.java
		
		JMenu mnLancamentos = new JMenu("Lan\u00E7amentos");
		mnMenu.add(mnLancamentos);
		
		JMenuItem mntmNotas = new JMenuItem("Notas");
		mnLancamentos.add(mntmNotas);
		
		JMenuItem mntmPresenca = new JMenuItem("Presen\u00E7a");
		mnLancamentos.add(mntmPresenca);
		
========
>>>>>>> bf78a659531f2e6e05aab8b8c9af0531552a9c2f

		JMenuItem mntmNewMenuItem = new JMenuItem("Lan\u00E7amento de notas");
		mnMenu.add(mntmNewMenuItem);

<<<<<<< HEAD
=======
>>>>>>>> bf78a659531f2e6e05aab8b8c9af0531552a9c2f:src/main/java/views/TelaAdministrador.java
>>>>>>> bf78a659531f2e6e05aab8b8c9af0531552a9c2f
		JMenu mnNewMenu_1 = new JMenu("Cadastros");
		mnMenu.add(mnNewMenu_1);

		JMenuItem mntmAluno = new JMenuItem("Aluno(a)");
		mntmAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
=======
				JOptionPane.showMessageDialog(null,"Parabens Administrador");
>>>>>>> bf78a659531f2e6e05aab8b8c9af0531552a9c2f
				new CadastroAluno().setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmAluno);

		JMenuItem mntmTurma = new JMenuItem("Turma");
		mntmTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroTurma().setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmTurma);

		JMenuItem mntmFuncionario = new JMenuItem("Funcionario(a)");
		mntmFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroFuncionarios().setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmFuncionario);

		JMenu mnConf = new JMenu("Configura\u00E7\u00F5es");
		menuBar.add(mnConf);

		JMenu mAjuda = new JMenu("Ajuda");
		menuBar.add(mAjuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\IS&MA\\Documents\\Projetos Java\\fligsistemaescola\\Imagens\\gifs-de-leitura-4.gif"));
		lblNewLabel.setBounds(292, 80, 432, 351);
		contentPane.add(lblNewLabel);
	}

}
