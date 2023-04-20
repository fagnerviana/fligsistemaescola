package persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {
	
	
	 private static final String URL = "jdbc:postgresql://localhost:5434/sistemaacademico"; //incica o caminho do banco de dados
	 private static final String USER = "postgres"; // aqui vai o nome usuario que vc quer acessar
	 private static final String PASS = "admin"; // aqui a senha do seu banco
	 private static Conecta connection=null;

	public static Conecta criarConexao() throws ClassNotFoundException, SQLException{
	Class.forName("org.postgresql.Driver");
	//Connection novaconexao = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5434/sistemaacademico","postgres" , "admin");
	Conecta conecta = (Conecta) DriverManager.getConnection(URL, USER, PASS);
	if (conecta != null){
	System.out.print("Conexão efetuada com sucesso...");
	return conecta;
	}
	return null;
	}
	
	public static Conecta getConnection() {
		return connection;
	}
	

}
