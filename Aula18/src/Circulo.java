public class Circulo implements FormaGeometrica {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        // área do circulo: pi * r²
        return Math.PI * raio * raio;
    }

    
}
