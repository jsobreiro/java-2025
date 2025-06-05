package model;

public class Heroi extends Personagem {

    private String habilidadeEspecial;

    public Heroi(String nome, int hp, int atk, int def, String habilidadeEspecial) {
        super(nome, hp, atk, def);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nHabilidade Especial: " + habilidadeEspecial;
    }

    @Override
    public String toText() {
        // implementando um HERÓI
        // formato: HEROI;nome;hp;atk;def;habilidadeEspecial
        return "HEROI;" + getNome() + ";" + getHp() + ";" + getAtk() + ";"
                        + getDef()  + ";" + getHabilidadeEspecial();
    }

    

    
}
