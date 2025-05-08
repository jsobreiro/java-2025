public abstract class Funcionario {

    private String nome;

    public Funcionario() {
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método abstrato: não contém implementação, apenas sua assinatura
    // Quem implementará este método, serão as classes quem herdarem Funcionario
    public abstract String apresentacao();

    @Override
    public String toString() {
        return  "Nome: " + nome;
    }

}
