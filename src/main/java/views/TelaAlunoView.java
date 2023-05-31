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
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.persistence.EntityManager;
import javax.swing.ImageIcon;

public class TelaAlunoView extends JFrame {

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
					TelaAlunoView frame = new TelaAlunoView();
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
	public TelaAlunoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 484);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Notas");
		mnMenu.add(mntmNewMenuItem);

		JMenu mnNewMenu_1 = new JMenu("Informa\u00E7\u00F5es");
		mnMenu.add(mnNewMenu_1);

		JMenuItem mntmAluno = new JMenuItem("Aluno(a)");
		mntmAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroAlunoView().setVisible(true);
				//IMPRIMIR NA TELA TESTANDO O METODO LOGIN
				JOptionPane.showMessageDialog(null,"Parabens ALUNO");
			}
		});
		mnNewMenu_1.add(mntmAluno);

		JMenuItem mntmTurma = new JMenuItem("Turmas");
		mntmTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AlunosVSMateriaVIew().setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmTurma);

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
