public class Revista extends Impresso {

    private String editorChefe;
    private String issn; // "Rg" da revista contendo 8 digitos
    
    public Revista(String titulo, int ano, String genero, 
    String editorChefe, String issn) {
        super(titulo, ano, genero);
        this.editorChefe = editorChefe;
        this.issn = issn;
    }

    public String getEditorChefe() {
        return editorChefe;
    }

    public void setEditorChefe(String editorChefe) {
        this.editorChefe = editorChefe;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nEditor chefe: " + editorChefe +
                "\nISSN: " + issn;
    }

}
