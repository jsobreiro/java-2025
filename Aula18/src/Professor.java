public class Professor extends Funcionario {

    private String disciplina;

    public Professor() {
    }

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    @Override
    public String apresentacao() {
        return "O professor " + getNome() + 
        " leciona a disciplina " + disciplina;
    }

    
    @Override
    public String toString() {
        return  super.toString() +
                "\nDisciplina que leciona: " + disciplina;
    }



}
