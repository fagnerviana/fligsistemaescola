package application;

import modelo.TipoUsuario;
import modelo.Usuario;
import persistencia.UsuarioDao;

public class Teste {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//Testando o modelo ususario com insert no banco de dados:
		Usuario usuario = new Usuario();
		usuario.setNome("Homem Aranha");
		usuario.setSenha("123456789");
		usuario.setLogin("spiderman");
		usuario.setTipoUsuario(TipoUsuario.Aluno);
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.insertUsuario(usuario);

	}

}
