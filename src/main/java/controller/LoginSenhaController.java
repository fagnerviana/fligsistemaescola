package controller;


import controller.helper.LoginSenhaHelper;
import modelo.Usuario;
import persistencia.UsuarioDao;
import views.LoginSenha;
<<<<<<< HEAD
import views.TelaPrincipal;
=======
import views.TelaAdministrador;
import views.TelaAluno;
import views.TelaProfessor;

>>>>>>> bf78a659531f2e6e05aab8b8c9af0531552a9c2f

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
		
<<<<<<< HEAD
		Usuario autenticado = new Usuario();
		autenticado = usuarioDao.validarLogin(usuario.getLogin(), usuario.getSenha());
		
		System.out.println(autenticado);
		if (autenticado != null) {
			TelaPrincipal inicio = new TelaPrincipal();
			inicio.setVisible(true);
			this.view.dispose();
=======
		//Aqui o autenticado recebe o usuario que foi autenticado
		Usuario autenticado = new Usuario();
		autenticado = usuarioDao.validarLogin(usuario.getLogin(), usuario.getSenha());
		
		//Verificar se é null, caso seja 
		if (autenticado != null) {
			
			//Aqui verifica o tipo de usuario e encaminha conforme a tela ao seu perfil
			if(autenticado.getTipoUsuario().toString() =="ALUNO") {

				TelaAluno inicio = new TelaAluno();			
				inicio.setVisible(true);
				
				this.view.dispose();
				//Aqui verifica o tipo de usuario e encaminha conforme a tela ao seu perfil	
			}else if(autenticado.getTipoUsuario().toString() =="PROFESSOR") {
				TelaProfessor inicio = new TelaProfessor();			
				inicio.setVisible(true);
				
				this.view.dispose();
				//Aqui verifica o tipo de usuario e encaminha conforme a tela ao seu perfil
			}else if(autenticado.getTipoUsuario().toString() =="ADMINISTRADOR") {
				TelaAdministrador inicio = new TelaAdministrador();			
				inicio.setVisible(true);
				
				this.view.dispose();
			}		
			
>>>>>>> bf78a659531f2e6e05aab8b8c9af0531552a9c2f
		} else {
			// System.out.println(autenticado.getNome());
			view.exibirMSG("Usuario ou senha incorretos");
		}

		// Usuario usuario = helper.validarLogin();

	}

}
