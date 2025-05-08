public class Quadrado implements FormaGeometrica{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        // area do quadrado: lado² (lado * lado)
        return lado * lado;
    }

    
    
}
