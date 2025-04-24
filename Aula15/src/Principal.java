import agregacao.*;
import associacao.*;
import composicao.Disciplina;
import composicao.Professor;
import heranca.Coordenador;
import heranca.CoordenadorAdjunto;
import heranca.Docente;

public class Principal {

    public static void main(String[] args) {
        
        // Na associação, pode ocorrer relacionamento entre objetos, mas eles não são
        // dependentes um do outro. Eles existem de forma independente, e se remover
        // o relacionamento, não afetará o funcionamento individual de cada classe
        
        System.out.println("Exemplo Associação");
        Carro c = new Carro("Ford Fiesta");
        Carro c2 = new Carro("Nissan Sentra");
        Pessoa p = new Pessoa ("Zé");

        p.dirigir(c);
        p.dirigir(c2);

        // Na agregação, o relacionamento entre as classes é mais forte. Elas ainda podem
        // existir de forma independente. Porém, sem ocorrer o relacionamento, uma das
        // classes "perde" seu propósito. No exemplo abaixo, aluno pode existir de forma
        // independente, sem nunca ser adicionado a uma turma. Mas se no objeto 'turma'
        // não adicionarmos nenhum aluno, 'turma' perde seu própósito, pois seria um
        // TURMA VAZIA, sem alunos cadastrados nela.

        Aluno a1 = new Aluno("Huguinho");
        Aluno a2 = new Aluno ("Zézinho");
        Aluno a3 = new Aluno("Luizinho");

        Turma turma1 = new Turma(); // nova turma criada

        turma1.adicionarAluno(a1);
        turma1.adicionarAluno(a2);
        turma1.adicionarAluno(a3);

        System.out.println("\nExemplo Agregação");
        System.out.println("Alunos da Turma 1:");
        turma1.mostrarAlunos();
        
        // Na composição, o relacionamento entre classes é ainda mais forte.
        // Embora uma das partes possa existir sem a outra, há uma dependência FORTE entre elas.
        // Assim, as partes normalmente não podem existir se não forem integrar o todo.
        // No exemplo abaixo, 'Professor' pode existir de forma independente. Mas no contexto do programa,
        // o objetivo é lecionar alguma disciplina. Se o professor não for alocado em uma disciplina, ele
        // perde o sentido de sua existência. 'Disciplina', por outro lado, DEPENDE da existência de um
        // professor para poder existir. Se não houver professor que possa ser atribuído a uma disciplina
        // ela simplesmente não pode existir sozinha.

        Professor professor1 = new Professor("Jason Sobreiro");
        Disciplina disciplina1 = new Disciplina("Desenvolvimeto de Software", professor1);

        System.out.println("\nExemplo Composição");
        disciplina1.lecionar();

        // Resumo:
        // Associação:  um se relaciona com o outro, mas podem existir sem se relacionar
        // Agregação:   um faz parte do outro, mas podem existir sem se relacionar, embora uma das partes
        //              perderá o sentido de existir
        // Composição:  um faz parte do outro, mas há uma dependência forte para uma das partes (ou ambas)
        //              poderem existir.

        // ########################################### //

        // Herança: uma relação de hierarquia entre classes, onde temos uma 
        // superclasse, que detem os atributos e métodos comuns a outras classes,
        // e as classes filhas, que herdam todos os dados (atributos, métodos e
        // construtores) da superclasse, além de possuirem atributos e métodos
        // específicos delas.
        // O objetivo principal da herança é reduzir a quantidade de código repetido
        // e otimizar o desenvolvimento, agrupando dados comuns em uma única classe
        // que poderá ser herdada por outras.
        
        // No exemplo abaixo, vamos criar um docente e um coordenador. Ambos herdam
        // a classe Funcionário, compartilhando assim os seus atributos, métodos e
        // construtores

        Docente docente1 = new Docente("Jason Sobreiro", 
        123456, "Desenvolvimento de Software");

        Coordenador coordenador1 = new Coordenador("Diogo Deconto", 
        123457, "Engenharia de Software");

        CoordenadorAdjunto adjunto1 = new CoordenadorAdjunto("Fulano", 
        123458, "Engenharia de Software", 
        "Responder protocolos");

        System.out.println("\nExemplo Herança:");
        System.out.println("Dados do docente: " + docente1);
        System.out.println("\nDados do coordenador: " + coordenador1);
        System.out.println("\nDados do coord. adjunto: " + adjunto1);

        // IMPORTANTE: Em java não há herança multipla! 
        // Assim, não há como um coordenador ser docente também, dentro desta estrutura
        // de classes atual. Teríamos, neste caso, que criar uma terceira classe que
        // contivesse um relacionamento entre docente e coordenador (CoordenadorDocente, por exemplo)
        // Exemplos mais complexos ficam para a próxima aula
    }

}
