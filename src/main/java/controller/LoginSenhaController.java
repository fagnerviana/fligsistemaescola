package controller;


import controller.helper.LoginSenhaHelper;
import modelo.Usuario;
import persistencia.UsuarioDao;
import views.LoginSenha;
import views.TelaAdministradorView;
import views.TelaAlunoView;
import views.TelaProfessorView;


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
		
		//Aqui o autenticado recebe o usuario que foi autenticado
		Usuario autenticado = new Usuario();
		autenticado = usuarioDao.validarLogin(usuario.getLogin(), usuario.getSenha());
		
		//Verificar se é null, caso seja 
		if (autenticado != null) {
			
			//Aqui verifica o tipo de usuario e encaminha conforme a tela ao seu perfil
			if(autenticado.getTipoUsuario().toString() =="ALUNO") {

				TelaAlunoView inicio = new TelaAlunoView();			
				inicio.setVisible(true);
				
				this.view.dispose();
				//Aqui verifica o tipo de usuario e encaminha conforme a tela ao seu perfil	
			}else if(autenticado.getTipoUsuario().toString() =="PROFESSOR") {
				TelaProfessorView inicio = new TelaProfessorView();			
				inicio.setVisible(true);
				
				this.view.dispose();
				//Aqui verifica o tipo de usuario e encaminha conforme a tela ao seu perfil
			}else if(autenticado.getTipoUsuario().toString() =="ADMINISTRADOR") {
				TelaAdministradorView inicio = new TelaAdministradorView();			
				inicio.setVisible(true);
				
				this.view.dispose();
			}		
			
		} else {
			// System.out.println(autenticado.getNome());
			view.exibirMSG("Usuario ou senha incorretos");
		}

		// Usuario usuario = helper.validarLogin();

	}

}
