public class Tutor {
    private String nome;
    private String telefone;
    private Animal animal;

    // Construtor parametrizado
    public Tutor(String nome, String telefone, Animal animal) {
        this.nome = nome;
        this.telefone = telefone;
        this.animal = animal;
    }

    // Getters
    public String getNome() { 
        return nome; 
    }

    public String getTelefone() { 
        return telefone; 
    }

    public Animal getAnimal() { 
        return animal; 
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Tutor: " + nome + 
        "\nTelefone: " + telefone + 
        "\n" + animal.toString();
    }
}


