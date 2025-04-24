public class Pessoa {

    // Atributos de pessoa
    // Atributos são SEMPRE globais à Classe
    String nome;
    int idade;
    String email;

    // Ações (métodos) que pessoa pode executar

    public void andar() {

        System.out.println(nome + " está andando!");
        
    }

    public void falar() {
        System.out.println(nome + " está falando!");
    }

}
