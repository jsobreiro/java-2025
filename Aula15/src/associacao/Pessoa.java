package associacao;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void dirigir(Carro carro) {
        System.out.println(nome + " está dirigindo o carro " +
        carro.getModelo());
    }


}
