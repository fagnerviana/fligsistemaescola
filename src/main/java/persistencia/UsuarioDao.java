package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Usuario;
import modelo.TipoUsuario;

public class UsuarioDao {

	private Connection connection;

	public UsuarioDao() {
		try {
			connection = Conecta.criarConexao();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Ok funcionando
	// Realiza a inserção no banco de dados do objeto Usuario
	public void insertUsuario(Usuario usuario) throws ClassNotFoundException {
		try {
			PreparedStatement statement = connection
					.prepareStatement("insert into usuario(nome,senha,login,tipousuario) values(?,?,?,?)");
			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getSenha());
			statement.setString(3, usuario.getLogin());
			statement.setString(4, usuario.getTipoUsuario().getDescricao());

			statement.execute();
			statement.close();

			System.out.println("Inserindo usuario com Sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateUsuario(Usuario usuario) { 
	 
	try { 
		PreparedStatement statement = connection.prepareStatement(
	  "UPDATE usuario SET nome=?,login=?,senha=?,tipousuario=? WHERE id_usuario=?");
	  statement.setString(1,usuario.getNome()); 
	  statement.setString(2,usuario.getSenha()); 
	  statement.setString(3,usuario.getLogin());
	  statement.setString(4,usuario.getTipoUsuario().getDescricao());
	  statement.setInt(5, usuario.getId());
	  
	  statement.execute(); 
	  statement.close(); } 
	catch (SQLException e) {
	  e.printStackTrace(); 
	  }
	}

	
	public void deleteUsuario(int id) {
		try {
			PreparedStatement statement = connection.prepareStatement(
					"DELETE from usuario WHERE id_usuario=?");
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public Usuario getUsuarioById(int id) {

		// Necessario instanciar usuario e tipousuario
		Usuario usuario = null;
		TipoUsuario tipousuario = null;

		try {
			//Da o comando SELECT *FROM usuario WHERE id_usuario 
			PreparedStatement statement = connection.prepareStatement("SELECT *FROM usuario WHERE id_usuario = ?");
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {

				usuario = new Usuario();
				usuario.setId(resultSet.getInt("id_usuario"));
				usuario.setNome(resultSet.getString("nome"));
				usuario.setLogin(resultSet.getString("login"));
				usuario.setSenha(resultSet.getString("senha"));
				usuario.setTipoUsuario(TipoUsuario.getByString(resultSet.getString("tipousuario")));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
}
