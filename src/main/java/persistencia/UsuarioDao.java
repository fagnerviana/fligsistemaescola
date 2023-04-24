package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Usuario;

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

	// Resolver Depois descobrir como realizar pesquisa no bd pelo ENUM public
	/*Pessoa getPessoaById(int id) { Pessoa pessoa =null; TipoRenda renda = null;
	  
	  try { PreparedStatement statement = connection.prepareStatement(
	  "SELECT *FROM pessoa WHERE id_pessoa = ?"); statement.setInt(1, id);
	  ResultSet resultSet = statement.executeQuery(); if (resultSet.next()) {
	  
	  
	  pessoa = new Pessoa(); pessoa.setId(resultSet.getInt("id_pessoa"));
	  pessoa.setNome(resultSet.getString("nome"));
	  pessoa.setEmail(resultSet.getString("email"));
	  pessoa.setRenda(resultSet.getDouble("renda"));
	  //pessoa.setTiporenda(TipoRenda.values().hashCode(TipoRenda.getTipoRendaInt(
	  resultSet.getInt("renda")));
	  //pessoa.se(TipoRenda.getTipoRendaInt(resultSet.getInt("renda")));
	  pessoa.setTiporenda(TipoRenda.getBy(resultSet.getInt("id_tiporenda")));
	  pessoa.setDependentes(resultSet.getInt("dependentes"));
	  
	 } } catch (SQLException e) { e.printStackTrace(); } return pessoa; }
	 
	 */

}