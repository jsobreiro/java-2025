public class Coordenador extends Funcionario {

    private String curso;

    public Coordenador() {
    }

    public Coordenador(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String apresentacao() {
        return "O coordenador " + getNome() + 
        " coordena o curso " + curso;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nCurso que coordena: " + curso;
    }


}
