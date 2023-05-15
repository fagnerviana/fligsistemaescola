package controller;


import controller.helper.LoginSenhaHelper;
import modelo.Usuario;
import persistencia.UsuarioDao;
import views.LoginSenha;
import views.TelaPrincipal;

public class LoginSenhaController {

	private final LoginSenha view;
	private LoginSenhaHelper helper;
	//private UsuarioDao usuarioDao;

	public LoginSenhaController(LoginSenha view) {
			this.view =view;
			this.helper = new LoginSenhaHelper(view);
		}

	public void Validar(String login, String senha) {
		this.view.exibirMSG("Login: " + login + " Senha: " + senha);

	}

	public void EntrarNoSistema() {
		// Pegar usuario e senha da view LoginSenha
		Usuario usuario = helper.obterModelo();
		// Pesquisar Depois no banco
		UsuarioDao usuarioDao = new UsuarioDao(); //Foi necessario criar a instancia 
		
		Usuario autenticado = new Usuario();
		autenticado = usuarioDao.validarLogin(usuario.getLogin(), usuario.getSenha());
		
		//System.out.println(autenticado);
		if (autenticado != null) {
			TelaPrincipal inicio = new TelaPrincipal();
			inicio.setVisible(true);
			this.view.dispose();
		} else {
			// System.out.println(autenticado.getNome());
			view.exibirMSG("Usuario ou senha incorretos");
		}

		// Usuario usuario = helper.validarLogin();

	}

}
