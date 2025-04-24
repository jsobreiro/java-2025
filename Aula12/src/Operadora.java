public class Operadora {

    private String nome;
    private int codigoArea;

    public Operadora(String nome, int codigoArea) {
        this.nome = nome;
        this.codigoArea = codigoArea;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    @Override
    public String toString() {
        return  "Operadora: " + nome +
                "\nCódigo de área: " + codigoArea;
    }

    

    

}
