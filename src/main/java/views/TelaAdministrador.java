package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 484);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Lan\u00E7amento de notas");
		mnMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Cadastros");
		mnMenu.add(mnNewMenu_1);
		
		JMenuItem mntmAluno = new JMenuItem("Aluno(a)");
		mntmAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\IS&MA\\Documents\\Projetos Java\\fligsistemaescola\\Imagens\\gifs-de-leitura-4.gif"));
		lblNewLabel.setBounds(292, 80, 432, 351);
		contentPane.add(lblNewLabel);
	}
}
