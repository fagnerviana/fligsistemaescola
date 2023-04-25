package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Curso;
import modelo.TipoUsuario;
import modelo.Usuario;

public class CursoDao {
	
	private Connection connection;

	public CursoDao() {
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
	public void insertCurso(Curso curso) throws ClassNotFoundException {
		try {
			PreparedStatement statement = connection
					.prepareStatement("insert into curso(nome,valor,CargaHorariaTotal) values(?,?,?)");
			statement.setString(1, curso.getNome());
			statement.setDouble(2, curso.getValor());
			statement.setInt(3, curso.getCargaHorariaTotal());
			

			statement.execute();
			statement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateCurso(Curso curso) { 
	 
	try { 
		PreparedStatement statement = connection.prepareStatement(
	  "UPDATE curso SET nome=?,valor=?,cargaHorariaTotal=? WHERE id_curso=?");
	  statement.setString(1,curso.getNome()); 
	  statement.setDouble(2,curso.getValor()); 
	  statement.setInt(3,curso.getCargaHorariaTotal());
	  statement.setInt(5, curso.getId());
	  
	  statement.execute(); 
	  statement.close(); 
	} 
	catch (SQLException e) {
	  e.printStackTrace(); 
	  }
	}

	
	public void deleteCurso(int id) {
		try {
			PreparedStatement statement = connection.prepareStatement(
					"DELETE from curso WHERE id_curso=?");
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public Curso getCursoById(int id) {

		// Necessario instanciar usuario e tipousuario
		Curso curso = null;
		

		try {
			//Da o comando SELECT *FROM usuario WHERE id_usuario 
			PreparedStatement statement = connection.prepareStatement("SELECT *FROM curso WHERE id_curso = ?");
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {

				curso = new Curso();
				curso.setId(resultSet.getInt("id_curso"));
				curso.setNome(resultSet.getString("nome"));
				curso.setValor(resultSet.getDouble("valor"));
				curso.setCargaHorariaTotal(resultSet.getInt("cargahorariatotal"));
				

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}

}
