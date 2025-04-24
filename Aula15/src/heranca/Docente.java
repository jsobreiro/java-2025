package heranca;

public class Docente extends Funcionario {

    private String nomeDisciplina;

    // o contrutor parametrizado recebe todos os dados que compõe um
    // Professor: nome, matricula (da super classe) e nomeDisciplina
    // (exclusivo de 'Docente')
    public Docente(String nome, int matricula, String nomeDisciplina) {
        super(nome, matricula);
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "\nDisciplina que leciona: " + nomeDisciplina;
    }

    

    

    
    

}
