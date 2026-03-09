import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
    
public Connection obterConexao(){
    try {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_estoque", "root", "2365");
    
    } catch (Exception e) {
        System.out.println("Erro ao conectar com o banco de dados!");
        throw new RuntimeException();
    }


}



}
