
public class Produto {
    
    private int id;
    private String nome;
    private double preco;
    private int quantidade;

    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    
    public Produto(int id, String nome, double preco, int quantidade){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int qtd){
        if(qtd > 0){
            this.quantidade += qtd;
        }
    }

    public void removerEstoque(int qtd){
        if (qtd > 0 && quantidade >= qtd){
            this.quantidade -= qtd;
        } else {
            System.out.println("Não é possível remover essa quantidade do estoque!");
        }
    }

    public void exibirProduto(){
        
        System.out.printf("ID: %d | O produto %s custa R$ %.2f e temos %d no estoque.\n", this.id, this.nome, this.preco, this.quantidade);
    }

    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
}