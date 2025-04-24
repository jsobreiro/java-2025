public class Livro {

    private String titulo;
    private String editora;
    private int numeroPaginas;
    private Autor autor;

    public Livro(String titulo, String editora, int numeroPaginas, Autor autor) {
        this.titulo = titulo;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return  "Título do livro: " + titulo + 
                "\nEditora: " + editora +
                "\nNúmero de páginas: " + numeroPaginas +
                "\n" + autor.toString();
    }
    
    
    



}
