public class Retangulo extends Forma{
    public double largura;
    public double altura;

    public Retangulo(double largura, double altura) {
        super("Retângulo");
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}