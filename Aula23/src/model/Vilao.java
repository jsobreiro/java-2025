package model;

public class Vilao extends Personagem{

    private String faccao; // facção

    public Vilao(String nome, int hp, int atk, int def, String faccao) {
        super(nome, hp, atk, def);
        this.faccao = faccao;
    }

    public String getFaccao() {
        return faccao;
    }

    public void setFaccao(String faccao) {
        this.faccao = faccao;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nFacção: " + faccao;
    }

    @Override
    public String toText() {
        // implementando um VILAO
        // formato: VILAO;nome;hp;atk;def;facção
        return "VILAO;" + getNome() + ";" + getHp() + ";" + getAtk() + ";"
                        + getDef()  + ";" + getFaccao();
    }

}
