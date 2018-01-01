import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaBD {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = Conexao.getConnection();
		System.out.println("Abrindo conexao!!");
		
		Statement statement = conexao.createStatement();
		boolean result = statement.execute("select * from Produto");
		if(result){
			//retorna conjunto de resultados
			ResultSet resultSet = statement.getResultSet();
			//Comeca por padrao no elemento anterior, ou seja antes do primeiro elemento.
			//para isso vamos ao proximo
				
			while (resultSet.next()) {
				String id = resultSet.getString("id");
				String nome = resultSet.getString("nome"); // pega coluna 
				String desc = resultSet.getString("descricao");
				System.out.println("Id "+ id + ", nome: " + nome + ", descricao: " + desc +".");
			}
			resultSet.close();
			statement.close();
		}	
		conexao.close();
		
	}

}
