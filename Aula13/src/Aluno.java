public class Aluno {

    private String nome;
    private int rgm;

    public Aluno(String nome, int rgm) {
        this.nome = nome;
        this.rgm = rgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRgm() {
        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    @Override
    public String toString() {
        return nome + " (RGM " + rgm + ")";
    }

        

}
