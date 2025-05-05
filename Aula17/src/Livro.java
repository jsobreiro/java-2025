public class Livro extends Impresso {

    private String autor;
    private String isbn; // "rg" do livro com 13 digitos
    
    public Livro(String titulo, int ano, String genero, 
    String autor, String isbn) {
        super(titulo, ano, genero);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nAutor: " + autor +
                "\nISBN: " + isbn;
    }

    


}
