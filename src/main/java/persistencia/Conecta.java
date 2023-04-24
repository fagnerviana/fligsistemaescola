package persistencia;

import java.sql.*;


import java.sql.*;

public class Conecta {

	 private static final String URL = "jdbc:postgresql://localhost:5434/sistemaacademico"; //incica o caminho do banco de dados
	 private static final String USER = "postgres"; // aqui vai o nome usuario que vc quer acessar
	 private static final String PASS = "admin"; // aqui a senha do seu banco
	 private static Connection connection=null;

	public static Connection criarConexao() throws ClassNotFoundException, SQLException{
	Class.forName("org.postgresql.Driver");
	Connection conecta = DriverManager.getConnection(URL, USER, PASS);
	if (conecta != null){
	System.out.print("Conexão efetuada com sucesso...");
	return conecta;
	}
	return null;
	}
	
	public static Connection getConnection() {
		return connection;
	}
	

}
