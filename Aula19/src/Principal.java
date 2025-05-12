public class Principal {
    public static void main(String[] args) {
        
        int op; // opção geral

        System.out.println("\nAULA 19");
        System.out.println("1) Rodar Exemplo");
        System.out.println("2) Apresentar Menu");
        System.out.print("Informe uma opção: ");
        op = Console.lerInt(); // ler opção do teclado

        if (op == 1) {
            exemplo();
            System.exit(0); // status 0 = estado esperado ao finalizar o programa
        }

        if (op == 2) {
            apresentarMenu();
            System.exit(0);
        }

        System.out.println("Opção inválida. Programa Finalizado...");

    }

    public static void exemplo() {
                // criar 2 instâncias de programador
                Programador p1 = new Programador("Fulano da Silva", 80f, 56.45f, 15f);
                Programador p2 = new Programador("Beltrano Souza", 60f, 45.45f, 5f);
        
                // criar 2 instâncias de gerente
                Gerente g1 = new Gerente("Huguinho Oliveira", 120, 40f, 1750f);
                Gerente g2 = new Gerente("Zézinho Pereira", 70, 52f, 2500f);
        
                //  criar instância de folha de pagamento
                FolhaPagamento folha = new FolhaPagamento();
        
                // adicionar funcionários criados na folha de pagamento
                folha.salvarFolhaFuncionario(p1);
                folha.salvarFolhaFuncionario(p2);
                folha.salvarFolhaFuncionario(g1);
                folha.salvarFolhaFuncionario(g2);
        
                // listar todas folhas de pagamento:
                folha.listarFolhas();
        
                // alterar horas extras de p1:
                p1.setHorasExtras(30);
        
                // alterar as horas trabalhas de p2:
                p2.setHorasTrab(80);
        
                // alterar o valor da hora de g1:
                g1.setValorHora(65.23f);
        
                // alterar a bonificação de g2:
                g2.setBonificacao(1500);
        
                // listar folhas atualizadas
                System.out.println("\n----------FOLHAS ATUALIZADAS----------\n");
                folha.listarFolhas();
    }

    public static void apresentarMenu() {

        int op; // opção do menu
        String nome;
        float valorHora, horasTrab;
        FolhaPagamento folha = new FolhaPagamento();

        do { 

            System.out.println("\nMENU");
            System.out.println("1) Cadastrar Folha de Pagamento de Gerente");
            System.out.println("2) Cadastrar Folha de Pagamento de Programador");
            System.out.println("3) Listar Folhas de Pagamento");
            System.out.println("0) Sair");
            System.out.print("Informe uma opção: ");
            op = Console.lerInt(); // ler do teclado a opção

            switch (op) {
                case 1: // cadastar folha de gerente

                    System.out.println("\nNome do Gerente: ");
                    nome = Console.lerString();

                    System.out.println("Horas trabalhadas: ");
                    horasTrab = Console.lerFloat();

                    System.out.println("Valor da hora:");
                    valorHora = Console.lerFloat();

                    System.out.println("Bonificação: R$ ");
                    float bonificacao = Console.lerFloat();

                    Gerente gerente = new Gerente(nome, horasTrab, valorHora, bonificacao);

                    folha.salvarFolhaFuncionario(gerente);
                    System.out.println("Folha do gerente " + nome + 
                    " cadastrada com sucesso!");
                                        
                    break;

                    case 2: // cadastar folha de programador

                    System.out.println("\nNome do Programador: ");
                    nome = Console.lerString();

                    System.out.println("Horas trabalhadas: ");
                    horasTrab = Console.lerFloat();

                    System.out.println("Valor da hora:");
                    valorHora = Console.lerFloat();

                    System.out.println("Horas extras do mês: ");
                    float horasextras = Console.lerFloat();

                    Programador programador = new Programador(nome, horasTrab, valorHora, horasextras);

                    folha.salvarFolhaFuncionario(programador);
                    System.out.println("Folha do programador " + nome + 
                    " cadastrada com sucesso!");

                    break;

                case 3:

                    folha.listarFolhas();
                    break;

                case 0:

                    System.out.println("\nO sistema foi finalizado...\n");
                    break;

                default:
                    System.out.println("\nOpção inválida! Digite novamente.");
            }
            
        } while (op != 0);


    }

}
