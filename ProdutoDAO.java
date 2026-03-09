import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
public class ProdutoDAO {
    
    private Conexao fabrica = new Conexao();

    public void cadastrar(Produto produto) {
        String sql = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";

        try {
            Connection conexao = fabrica.obterConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());

            stmt.execute();

            stmt.close();
            conexao.close();

            System.out.println("✅ Produto '" + produto.getNome() + "' salvo no banco de dados com sucesso!");

        } catch (SQLException e) {
            System.out.println("❌ Erro ao salvar o produto: " + e.getMessage());
        }
    }
    public ArrayList<Produto> listarTodos(){
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        String sql = "SELECT * FROM produtos";

        try {
            Connection conexao = fabrica.obterConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();

            
            while (rs.next()) {
                
                int id = rs.getInt("id"); 
                String nome = rs.getString("nome"); 
                double preco = rs.getDouble("preco"); 
                int quantidade = rs.getInt("quantidade");
                Produto produtoEncontrado = new Produto(id, nome, preco, quantidade);
                listaProdutos.add(produtoEncontrado);
    }
        
    } catch (Exception e){
        System.out.println("Erro ao listar produto!" + e.getMessage());
    }
    return listaProdutos;
 }

    public void atualizarEstoque(int id, int novaQuantidade){

        String sql = "UPDATE produtos SET quantidade = ? WHERE id = ?";

        try (Connection conn = fabrica.obterConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, novaQuantidade);
            stmt.setInt(2, id);

            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0 ){
                System.out.println("Estoque do produto (ID: "+ id +") atualizado para " + novaQuantidade + "!");
            }else{
                System.out.println("Produto com ID "+ id + " não encontrado.");
            }

        } catch (SQLException e) {
           System.out.println(" Erro ao atualizar o estoque: " + e.getMessage());
        }

    }

    public void removerProduto(int id){
        String sql = "DELETE FROM produtos WHERE id = ?";

        try (Connection conn = fabrica.obterConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            
                stmt.setInt(1, id);
                int linhasAfetadas = stmt.executeUpdate();
                if(linhasAfetadas > 0 ){
                    System.out.println("Produto (ID: "+ id +") removido com sucesso!");

                }else{
                    System.out.println("Produto com ID "+ id +" não encontrado.");
                }
        } catch (SQLException e) {
            System.out.println("Erro ao remover produto: " + e.getMessage());
        }

       


    }

}
