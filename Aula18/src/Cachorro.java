public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String fazerSom() {
        return "O cachorro " + raca + " " +  getNome() + " fez Au au!";
    }

    



}
