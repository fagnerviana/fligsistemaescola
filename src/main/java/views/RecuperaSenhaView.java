package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class RecuperaSenhaView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecuperaSenhaView frame = new RecuperaSenhaView();
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
	public RecuperaSenhaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vamos te lembrar a senha cadastrada !!!\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(75, 45, 287, 59);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(85, 109, 244, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnEnviarEmail = new JButton("Enviar ");
		btnEnviarEmail.setBounds(75, 155, 89, 23);
		contentPane.add(btnEnviarEmail);
		
		JLabel lblNewLabel_1 = new JLabel("Esqueceu a senha? Digite o email cadastrado! \r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(65, 11, 287, 59);
		contentPane.add(lblNewLabel_1);
	}

}
