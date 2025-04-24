import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private String nome;
    private int limiteCarros;
    private List<Carro> carros;

    public Estacionamento(String nome, int limiteCarros) {
        this.nome = nome;
        this.limiteCarros = limiteCarros;
        carros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLimiteCarros() {
        return limiteCarros;
    }

    public void setLimiteCarros(int limiteCarros) {
        this.limiteCarros = limiteCarros;
    }

    public void estacionar(Carro carro) {
        carros.add(carro);
        System.out.println("\nCarro " + carro.getModelo() + 
        " (" + carro.getPlaca() + ") " + carro.getCor() + " estacioando");
    }

    public void sair(String placa) {

        for (Carro carroTemp: carros) {
            
            if (carroTemp.getPlaca().equals(placa)) {

                carros.remove(carroTemp);

                System.out.println("\nCarro " + carroTemp.getModelo() + 
                " (" + carroTemp.getPlaca() + ") " + carroTemp.getCor() + 
                " saiu do estacionamento!");

                return; // encerro a execução do método
            }

        }

        System.out.println("\nCarro com a placa " + placa + " não localizado...");

    }

    public int getQtdeCarrosEstacionados() {
        return carros.size();
    }

    public void listarCarrosEstacionados() {

        System.out.println("\nCarros Estacionados:");
        for (Carro carroTemp : carros) {
            System.out.println(carroTemp); // invoca o toString automaticamente
            System.out.println("----------------------");
        }

    }


}
