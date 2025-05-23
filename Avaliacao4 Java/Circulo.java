public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}