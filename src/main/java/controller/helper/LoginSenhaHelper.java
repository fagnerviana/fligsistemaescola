package controller.helper;

import modelo.Usuario;
import views.LoginSenha;

public class LoginSenhaHelper {
	
	
	//Ter propriedade do tipo LoginSenha para receber os dados da tela
		private final LoginSenha view;
		public LoginSenhaHelper(LoginSenha view) {
			this.view = view;
		}
		
		//Aqui irá receber da tela LoginSenha getTxLogin e getTxtSenha
		public Usuario obterModelo() {
			
			Usuario modelo = new Usuario();
			String login = view.getTxtLogin().getText();
			String senha = view.getPasswordField().getText();
			
			//sempre seguir a assinatura do construtor
			 modelo = new Usuario(senha, login);
							
			return modelo;
		}
		
		public void setarUsuario(Usuario usuario) {
			String login = usuario.getLogin();
			String senha = usuario.getLogin();
			
			view.getTxtLogin().setText(login);
			view.getPasswordField().setText(senha);
		}
		
		public void esqueciSenha() {
			//String email = get
		}
		/*
		public Usuario obterModelo() {
			
			//Pegar usuario e senha  da view LoginSenha
			String login = this.view.getTxtLogin().getText();
			String senha = this.view.getPasswordField().getText();
			//Criar um usuario modelo para receber as informações de acesso;
			Usuario modelo = new Usuario();
			modelo.setLogin(login);
			modelo.setSenha(senha);
			return modelo;
					
		}
		
		public void setarModelo(Usuario modelo) {
			String login = modelo.getLogin();
			String senha = modelo.getSenha();
			
			view.getTxtLogin().setText(login);
			view.getPasswordField().setText(senha);
					
		}
		
	*/	
		public void limparTela() {
			
			view.getTxtLogin().setText("");
			view.getPasswordField().setText("");
			
		}

}
