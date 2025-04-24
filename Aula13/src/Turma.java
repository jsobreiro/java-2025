import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nomeTurma;
    private List<Aluno> alunos;

    public Turma (String nomeTurma) {
        this.nomeTurma = nomeTurma;
        alunos = new ArrayList<>(); // inicializamos a List alunos
        // a implementação escolhida foi ArrayList
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("\nTurma: " + nomeTurma);
        System.out.println("Alunos:\n");

        // percorrer ArrayList para mostrar alunos cadastrados
        for (Aluno tempAluno : alunos) { // foreach
            // Mostrar dados do aluno atual que o laço copiou
            // para 'tempAluno'
            System.out.println(tempAluno.toString());

        }

    }

    public int getTamanhoTurma() {
        return alunos.size(); // retorna a quantidade de elementos salvos na lista
    }

}
