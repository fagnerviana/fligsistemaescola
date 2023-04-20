package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Usuario;

public class UsuarioDao {
	
	
private Conecta connection;
	
	public UsuarioDao() {
	    try {
	      connection = Conecta.criarConexao();
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
	
/*	//Ok funcionando 
	public void insertUsuario(Usuario usuario) throws ClassNotFoundException {
	   try {
		  PreparedStatement statement = connection.getConnection(
				  "insert into usuario(nome,senha,login,tipousuario) values(?,?,?,?)");
		      statement.setString(1, usuario.getNome());
		      statement.setString(2, usuario.getSenha());
		      statement.setString(3, usuario.getLogin());
		      statement.setString(4, usuario.getTipoUsuario().getDescricao());
		      
		      statement.execute();
		      statement.close();
		      System.out.println("Inserindo Pessoa com Sucesso");
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		  }
	
	/*
	public void updatePessoa(Pessoa pessoa) {
	    try {
	      PreparedStatement statement = connection.prepareStatement(
	        "UPDATE pessoa SET nome = ?,email=?,renda=? WHERE id_pessoa=?");
	      //statement.setInt(1,pessoa.getId());
	      statement.setString(1,pessoa.getNome() );
	      statement.setString(2,pessoa.getEmail());
	      statement.setDouble(3, pessoa.getRenda());
	      statement.setInt(4, pessoa.getId());	      
	      
	      statement.execute();
	      statement.close();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
	
	public void deletePessoa(int id) {
	    try {
	      PreparedStatement statement = connection.prepareStatement(
	        "DELETE from pessoa WHERE id_pessoa=?");
	      statement.setInt(1,id);
	      statement.executeUpdate();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
	
	//Resolver Depois descobrir como realizar pesquisa no bd pelo ENUM
	public Pessoa getPessoaById(int id) {
	    Pessoa pessoa =null;
	    TipoRenda renda = null;
	    
	    try {
	      PreparedStatement statement = connection.prepareStatement(
	        "SELECT *FROM pessoa WHERE id_pessoa = ?");
	      statement.setInt(1, id);
	      ResultSet resultSet = statement.executeQuery();
	      if (resultSet.next()) {
	    	
	    	  
	    	pessoa = new Pessoa();
	    	pessoa.setId(resultSet.getInt("id_pessoa"));
	        pessoa.setNome(resultSet.getString("nome"));
	        pessoa.setEmail(resultSet.getString("email"));
	        pessoa.setRenda(resultSet.getDouble("renda"));
	        //pessoa.setTiporenda(TipoRenda.values().hashCode(TipoRenda.getTipoRendaInt(resultSet.getInt("renda")));
	        //pessoa.se(TipoRenda.getTipoRendaInt(resultSet.getInt("renda")));
	        pessoa.setTiporenda(TipoRenda.getBy(resultSet.getInt("id_tiporenda")));
	        pessoa.setDependentes(resultSet.getInt("dependentes"));
	              
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    return pessoa;
	  } 
*/
}
