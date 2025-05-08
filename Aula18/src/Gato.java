public class Gato extends Animal{

    private String cor;

    public Gato(String nome, String cor) {
        super(nome);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String fazerSom() {
        return "O gato " + cor + " " + getNome() + " fez miau!";
    }

    
    
    

}
