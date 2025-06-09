package model;

public class Pokemon {

    private String nome;
    private String tipo;
    private MoveSet movimentos;

    public Pokemon(String nome, String tipo, MoveSet movimentos) {
        this.nome = nome;
        this.tipo = tipo;
        this.movimentos = movimentos;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public MoveSet getMovimentos() { return movimentos; }
    public void setMovimentos(MoveSet movimentos) {  this.movimentos = movimentos; }

    @Override
    public String toString() {
        return  "\nNome: " + nome + 
                "\nTipo: " + tipo +
                movimentos;
    }

    public String toText() {
        return nome + ";" + tipo + ";" + movimentos.toText();
    }

    public static Pokemon fromText(String pokemon) {

        String[] parte = pokemon.split(";");

        String nome = parte[0];
        String tipo = parte[1];
        MoveSet movimentos = new MoveSet(parte[2], parte[3], parte[4], parte[5]);

        return new Pokemon(nome, tipo, movimentos);

    }
    



}
