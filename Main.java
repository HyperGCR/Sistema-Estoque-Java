import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    
public static void main(String[]args){
Scanner input = new Scanner(System.in);
ProdutoDAO dao = new ProdutoDAO();

int opcao = 0;

while (opcao != 5) {
    
System.out.println("\n=== SISTEMA DE ESTOQUE ===");
System.out.println("1 - Cadastrar novo Produto\n2 - Listar todos os Produtos\n3 - Atualizar Estoque\n4 - Remover Produto\n5 - Sair");
System.out.println("Escolha uma opção: ");
opcao = input.nextInt();
input.nextLine();

switch (opcao) {
    case 1:
        System.out.println("Informe o nome do produto: ");
         String nome = input.nextLine();
        System.out.println("Valor do produto: ");
        double preco = input.nextDouble();
        System.out.println("Quanto desse produto quer guardar no estoque: ");
        int quantidade = input.nextInt();
        Produto novoProduto = new Produto(nome, preco, quantidade);
        dao.cadastrar(novoProduto);
        break;
    case 2:
        System.out.println("\n-- Lista de Produtos --");
        ArrayList<Produto> meusProdutos = dao.listarTodos();
        for (Produto p : meusProdutos) {
            p.exibirProduto();
        }

        break;
    case 3:
        System.out.println("\n--- ATUALIZAR ESTOQUE ---");
        System.out.println("Digite o ID do produto que deseja atualizar: ");
        int idAtualizar = input.nextInt();
        
        System.out.println("Digite a nova quantidade total no estoque: ");
        int novaQuantidade = input.nextInt();
        
        dao.atualizarEstoque(idAtualizar, novaQuantidade);
        break;
    case 4:
        System.out.println("\n--- REMOVER PRODUTO ---");
        System.out.println("Digite o ID do produto a ser removido: ");
        int idRemover = input.nextInt();
        
        dao.removerProduto(idRemover);
        break;
    case 5:
        System.out.println("\nSaindo do Sistema de Estoque... Até a próxima!");
        break;
    default:
        System.out.println("Opção invalida! Tente novamente.");
        break;
}


}

}
}