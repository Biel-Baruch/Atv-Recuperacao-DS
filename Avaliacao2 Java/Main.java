public class Main{
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota Corolla", "ABC-1234", 2022, 4);
        Moto moto = new Moto("Honda CB500", "XYZ-5678", 2021, 500);

        System.out.println("Detalhes do Carro:");
        carro.exibirInformacoesCarro();

        System.out.println("\nDetalhes da Moto:");
        moto.exibirInformacoesMoto();
    }
}