public class Quadrado extends Retangulo{
    private double lado;

    public Quadrado(double lado) {
        super(lado, lado);
        this.lado = lado;
        this.nome = "Quadrado";
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}