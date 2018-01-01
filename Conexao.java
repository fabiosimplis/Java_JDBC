import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// classe que cria conexão com o banco de dados.
public class Conexao {
	
	static Connection getConnection() throws SQLException{
		
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		return connection;
	}
}
