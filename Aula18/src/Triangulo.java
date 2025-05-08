public class Triangulo implements FormaGeometrica{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // area do triangulo: (base * altura) / 2
        return (base * altura) / 2;
    }

    
    

}
