package application;

import modelo.TipoUsuario;
import modelo.Usuario;
import persistencia.UsuarioDao;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// Testando o metodo getUsuarioById informando o ID:
		Usuario usuario = new Usuario();
		usuario.setId(2);

		UsuarioDao usuarioDao = new UsuarioDao();
		System.out.println(usuarioDao.getUsuarioById(usuario.getId()));
		
		
		
		/*
		
		//Testando o metodo update UsuarioDao inserindo o seu ID:
				Usuario usuario = new Usuario();
				usuario.setId(1);
				
				
				UsuarioDao usuarioDao = new UsuarioDao();
				usuarioDao.deleteUsuario(usuario.getId());

		
		
		
		
		//Testando o metodo update UsuarioDao inserindo o seu ID:
		Usuario usuario = new Usuario();
		usuario.setNome("Neymar");
		usuario.setSenha("123456789");
		usuario.setLogin("meninoney");
		usuario.setTipoUsuario(TipoUsuario.Aluno);
		usuario.setId(1);
		
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.updateUsuario(usuario);

		
		
		
		//Testando o metodo update UsuarioDao inserindo o seu ID:
				Usuario usuario = new Usuario();
				usuario.setNome("Pelé");
				usuario.setSenha("123456789");
				usuario.setLogin("reipele");
				usuario.setTipoUsuario(TipoUsuario.Professor);
				usuario.setId(1);
				
				
				UsuarioDao usuarioDao = new UsuarioDao();
				usuarioDao.updateUsuario(usuario);
		
		/*		
		//Testando o modelo ususario com insert no banco de dados:
		Usuario usuario = new Usuario();
		usuario.setNome("Homem Aranha");
		usuario.setSenha("123456789");
		usuario.setLogin("spiderman");
		usuario.setTipoUsuario(TipoUsuario.Aluno);
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.insertUsuario(usuario);
		*/
	}

}
