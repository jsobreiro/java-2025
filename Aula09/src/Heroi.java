public class Heroi {

    private String nome;
    private String raca;
    private String golpeEspecial;

    public Heroi() { }

    public Heroi(String nome, String raca, String golpeEspecial) {
        this.nome = nome;
        this.raca = raca;
        this.golpeEspecial = golpeEspecial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getGolpeEspecial() {
        return golpeEspecial;
    }

    public void setGolpeEspecial(String golpeEspecial) {
        this.golpeEspecial = golpeEspecial;
    }

    
    @Override
    public String toString() {
        String dados =  "\nNome do herói: " + nome +
                        "\nRaça: " + raca +
                        "\nGolpe Especial: " + golpeEspecial;

        return dados;
    }

    public void atacar() {
        System.out.println("O herói " + nome + " atacou o inimigo com o golpe " 
        + golpeEspecial + "!");
    }

    


}
