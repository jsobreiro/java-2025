public class Carro implements Comunicar{

    private String modelo;
    private String placa;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public String fazerSom() {
        return "O carro " + modelo + " (" + placa + 
        ") está buzinando! Bi bi!";
    }

    

}
