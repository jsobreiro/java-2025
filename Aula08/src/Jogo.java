public class Jogo {

    private String titulo;
    private String genero;
    private int anoLancamento;

    // construtores

    // construtor parametrizado
    public Jogo (String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    // construtor padrão
    public Jogo() { } // cria uma nova instância, com os atributos zerados (nulos)

    // construtor que só recebe o título
    public Jogo (String titulo) {
        this.titulo = titulo;
        // informando dentro do código os valores dos outros atibutos
        genero = "Não especificado"; 
        anoLancamento = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        
        String ano = anoLancamento == 0 ? "Não especificado" : anoLancamento + "";
        // ao concatenar um espaço em banco com uma variavel do tipo int, este valor
        // será considerado uma String, e assim, podemos atribuí-lo a variável do tipo String.
        // Concatenar um espaço em branco à variável é o semelhante a realizar:
        // String.valueOf(anoLancamento)

        
        String dados =  "Título do jogo: " + titulo + 
                        "\nGênero: " + genero + 
                        "\nAno de lançamento: " + ano + "\n";

        return dados;
    }

    

}
