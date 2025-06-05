package model;

public abstract class Personagem {

    private String nome;// nome do personagem
    private int hp;     // pontos de vida
    private int atk;    // ataque
    private int def;    // defesa

    public Personagem(String nome, int hp, int atk, int def) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return  "\nTipo de Personagem: " + getClass().getSimpleName() +
                "\nNome: " + nome +
                "\nPontos de Vida: " + hp +
                "\nAtaque: " + atk + "pts" +
                "\nDefesa: " + def + "pts";

    }

    // método abstrato que será implementado pelas subclasses para transformar objetos em strings
    public abstract String toText(); 
    
    public static Personagem fromText(String text) {

        // recebe uma string e quebra ela em várias partes.
        // cada parte será armazenada numa nova posição desse array partesPersonagem
        // identificamos o caracter responsável por quebrar a string como sendo o ";" (ponto-e-virgula)
        String[] partesPersonagem = text.split(";");

        // dados comuns dos personagens
        String tipoPersonagem = partesPersonagem[0];
        String nome = partesPersonagem[1];
        int hp = Integer.parseInt(partesPersonagem[2]);
        int atk = Integer.parseInt(partesPersonagem[3]);
        int def = Integer.parseInt(partesPersonagem[4]);
        
        // Verifica qual o tipo de personagem para retornar o objeto do tipo correto
        if (tipoPersonagem.equals("HEROI")) {
            String habilidade = partesPersonagem[5];
            return new Heroi(nome, hp, atk, def, habilidade);
        }

        if (tipoPersonagem.equals("VILAO")) {
            String faccao = partesPersonagem[5];
            return new Vilao(nome, hp, atk, def, faccao);
        }

        return null; // se vier algo inesperado, retornamos nulo, ou lançaremos uma exceção

    }

}
