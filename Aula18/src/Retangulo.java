public class Retangulo  implements FormaGeometrica{

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // area do retangulo: largura * altura
        return largura * altura;
    }

    
    

}
