package agregacao;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private List<Aluno> alunos;

    public Turma () {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void mostrarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

}
