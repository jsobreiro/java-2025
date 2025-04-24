public class Produto {

    private String nome;
    private float preco;
    private int codigo;

    public Produto(String nome, float preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return  "Produto: " + nome + " (Código: " + codigo + ")" +
                "\nPreço: R$ " + preco;  
    }


    


}
