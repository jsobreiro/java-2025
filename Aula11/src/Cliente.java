public class Cliente {

    private String nome;
    private String telefone;
    private Carro carro;

    public Cliente() {}

    public Cliente(String nome, String telefone, Carro carro) {
        this.nome = nome;
        this.telefone = telefone;
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        
        String dados =  "\nCliente:" +
                        "\nNome: " + nome +
                        "\nTelefone: " + telefone + 
                        carro.toString();
        return dados;
    }

    



}
