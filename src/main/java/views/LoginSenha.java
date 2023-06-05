package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.LoginSenhaController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

import java.awt.Font;

public class LoginSenha extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField passwordField;
	
	private final LoginSenhaController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSenha frame = new LoginSenha();
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
	public LoginSenha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		controller =  new LoginSenhaController(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		//Aqui o controlador LoginController será chamado para fazer as funções com o banco de dados.
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.EntrarNoSistema();
				//controller.Validar(txtLogin.getText(),passwordField.getText());
				
			//Chama a tela Principal apos o login do usuario  - true -	
			//new TelaPrincipal().setVisible(false);
		
			//Aqui fecha a tela de login apos execução de qualquer ação na tela
			//dispose();
			}
		});
		btnLogin.setBounds(66, 90, 89, 23);
		contentPane.add(btnLogin);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
				;
			}
		});
		btnExit.setBounds(165, 90, 89, 23);
		contentPane.add(btnExit);

		JButton btnEsqueciaSenha = new JButton("Esqueci a senha");
		btnEsqueciaSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RecuperaSenhaView().setVisible(true);
			}
		});
		btnEsqueciaSenha.setBounds(66, 124, 188, 23);
		contentPane.add(btnEsqueciaSenha);

		txtLogin = new JTextField();
		txtLogin.setBounds(66, 27, 213, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		txtLogin.getText();

		JLabel lblLogin = new JLabel("E-MAIL");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLogin.setBounds(20, 29, 46, 14);
		contentPane.add(lblLogin);

		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setBounds(20, 61, 46, 14);
		contentPane.add(lblSenha);

		passwordField = new JPasswordField();
		passwordField.setBounds(66, 59, 213, 20);
		contentPane.add(passwordField);

		JLabel lblImagem = new JLabel("");
		lblImagem.setIcon(
				new ImageIcon("C:\\Users\\IS&MA\\Documents\\Projetos Java\\fligsistemaescola\\Imagens\\transferir.jpeg"));
		lblImagem.setBounds(0, -17, 351, 211);
		contentPane.add(lblImagem);		
	}
	
	
	//Metodo para retornar a MSG apos execução do botão login
	public void exibirMSG(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
	
	//Criar getter e setter para receber ou enviar informações para o Logincontroller

	public JTextField getTxtLogin() {
		return txtLogin;
	}

	public void setTxtLogin(JTextField txtLogin) {
		this.txtLogin = txtLogin;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
	
	
}
