public class Principal {

    public static void main(String[] args) {
        
        int op;
        GerenciadorImpressos gerenciador = new GerenciadorImpressos();
        String titulo;
        int ano;
        String genero;

        do { 

            System.out.println("\nCADASTRO DE IMPRESSOS");
            System.out.println("1) Cadastrar livro");
            System.out.println("2) Cadastrar revista");
            System.out.println("3) Listar todos os impressos");
            System.out.println("4) Listar todos os livros");
            System.out.println("5) Listar todos as reistas");
            System.out.println("0) Sair");
            System.out.print("Informe uma opção: ");
            op = Console.lerInt();// leitura dos dados
            
            switch (op) {
                case 1: // cadastrar livro
                    
                    System.out.println("\nNovo Livro");

                    System.out.print("Título: ");
                    titulo = Console.lerString();

                    System.out.print("Ano: ");
                    ano = Console.lerInt();

                    System.out.print("Gênero: ");
                    genero = Console.lerString();

                    System.out.print("Autor: ");
                    String autor = Console.lerString();

                    System.out.print("ISBN: ");
                    String isbn = Console.lerString();

                    Livro livro = new Livro(titulo, ano, genero, autor, isbn);

                    gerenciador.salvarImpresso(livro);
                    break;

                case 2: // cadastrar revista

                    System.out.println("\nNova Revista");

                    System.out.print("Título: ");
                    titulo = Console.lerString();

                    System.out.print("Ano: ");
                    ano = Console.lerInt();

                    System.out.print("Gênero: ");
                    genero = Console.lerString();

                    System.out.print("Editor Chefe: ");
                    String editorChefe = Console.lerString();

                    System.out.print("ISSN: ");
                    String issn = Console.lerString();

                    Revista revista = new Revista(titulo, ano, genero, editorChefe, issn);

                    gerenciador.salvarImpresso(revista);

                    break;

                case 3: // listar todos os impressos

                    if (gerenciador.naoHaCadastros()) {
                        System.out.println("\nNão há impressos cadastrados!\n");
                        break; // sai do swtich/case
                    }

                    gerenciador.listarTodos();
                    break;

                case 4: // listar apenas os livros

                    if (gerenciador.naoHaLivros()) {
                        System.out.println("\nNão há livros cadastrados!\n");
                        break;
                    }

                    gerenciador.listarLivros();
                    break;

                case 5: // listar apenar as revistas

                    if (gerenciador.naoHaRevistas()) {
                        System.out.println("\nNão há Revistas cadastradas!\n");
                        break;
                    }

                    gerenciador.listarRevistas();
                    break;

                case 0:

                    System.out.println("\nPrograma finalizado...\n");
                    break;
                
                default:
                    System.out.println("\nOpção inválida. Digite novamente.\n");
                    break;
            }

        } while (op != 0);


    }

}
