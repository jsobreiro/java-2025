


public class Principal {

    public static void main(String[] args) {
        
       // criar um sistema que permita cadastar vários alunos
       // em uma turma. O sistema também deve permitir listar
       // todos os alunos de uma turma.

       int op;
       Turma turma = new Turma ("BES - Manhã (Osório)");

       do {

        System.out.println("\nMENU");
        System.out.println("1) Cadastrar Aluno");
        System.out.println("2) Listar Alunos da Turma");
        System.out.println("3) Sair");
        System.out.print("Informe uma opção: ");
        op = Console.lerInt();

        switch (op) {
            case 1:
                
                System.out.println("\nNovo Aluno:");

                System.out.print("Nome: ");
                String nome = Console.lerString();

                System.out.print("RGM: ");
                int rgm = Console.lerInt();

                // adicionar novo aluno na turma
                turma.adicionarAluno(new Aluno(nome, rgm));

                System.out.println("\nAluno adicionado com sucesso!");

                break;

            case 2:

                if (turma.getTamanhoTurma() == 0) {
                    System.out.println("\nATENÇÃO: Não há alunos cadastrados na turma!");
                    break; // encerra o 'case' antecipadamente
                } 

                turma.listarAlunos();

                break;

            case 3:

                System.out.println("\nO sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção Inválida. Digite Novamente.");
                break;
        }

       } while (op != 3);

    }


    public void exemploListaSimples() {

        Aluno a1 = new Aluno("Huguinho", 88123456);
        Aluno a2 = new Aluno("Zézinho", 88123457);
        Aluno a3 = new Aluno("Luizinho", 88123458);

        Turma turma1 = new Turma("BES2MA/BES3MA");

        turma1.adicionarAluno(a1);
        turma1.adicionarAluno(a2);
        turma1.adicionarAluno(a3);
        
        turma1.adicionarAluno(new Aluno("Fulano", 88123459));
        turma1.adicionarAluno(new Aluno("Beltrano", 88123460));
        turma1.adicionarAluno(new Aluno("Cicrano", 88123461));

        a1.setNome("Donald");

        // Mostrar alunos da turma na tela:
        turma1.listarAlunos();
    }

}
