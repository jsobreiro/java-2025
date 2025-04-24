public class Animal {
    private String nome;
    private String especie;
    private int idade;

    // Construtor parametrizado
    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    // Getters
    public String getNome() { 
        return nome; 
    }
    
    public String getEspecie() { 
        return especie; 
    }

    public int getIdade() { 
        return idade; 
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir dados do animal
    @Override
    public String toString() {
        return "Animal: " + nome + " (" + especie + ", " + idade + " anos)";
    }

    
}
