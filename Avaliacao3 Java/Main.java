public class Main{
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos Silva", 40, 8000.00, "TI");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Ana Souza", 28, 6000.00, "Java");

        System.out.println("Detalhes do Gerente:");
        gerente.exibirInformacoesGerente();

        System.out.println("\nDetalhes do Desenvolvedor:");
        desenvolvedor.exibirInformacoesDesenvolvedor();
    }
}