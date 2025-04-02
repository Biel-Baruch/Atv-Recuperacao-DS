public class Main{
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3000.00);
        ProdutoComDesconto produto2 = new ProdutoComDesconto("Smartphone", 2000.00, 10);

        System.out.println("Detalhes do Produto Normal:");
        produto1.exibirDetalhes();

        System.out.println("\nDetalhes do Produto com Desconto:");
        produto2.exibirDetalhesComDesconto();
    }
}