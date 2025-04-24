public class Carro {

    private String modelo;
    private String placa;
    private String cor;

    // Getters e Setters

    // Modelo:
    public String getModelo() {
        return modelo; // retornando o valor do ATRIBUTO modelo
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
        // this = refere-se ao ATRIBUTO da classe
    }

    // Placa:
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    // Ações próprias de Carro
    public void acelerar() {
        System.out.println(modelo + " " + cor + " está acelerando...");
    }

    public void parar() {
        System.out.println(modelo + " " + cor + " parou!");
    }

    // Sobrescrita = mudar o comportamento de um método que já existe
    @Override // sobrescrita do método toString
    public String toString() {
       
        String dadosCarro = "Modelo do carro: " + modelo + "\n" +
                            "Placa: " + placa + "\n" +
                            "Cor: " + cor + "\n";

        return dadosCarro;

    }


}
