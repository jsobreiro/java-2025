public class Principal {

    public static void main(String[] args) {
        
        // menu para executar os exemplos conforme a preferência

        int opcao; // opcao do menu

        do { 
            
            System.out.println("\nMenu Aula 06");
            System.out.println("1) Exemplo 01 - Média das idades");
            System.out.println("2) Exemplo 02 - Média das alturas");
            System.out.println("3) Exemplo 03 - Cadastro Cliente Simples");
            System.out.println("4) Exemplo 04 - Cadastro Clientes (POO)");
            System.out.println("0) Sair do programa");
            System.out.print("Informe uma opção: ");
            opcao = Console.lerInt();

            // verificar os valores possiveis para "opcao":
            switch (opcao) {

                case 1:
                    exemplo01();
                    break;

                case 2:
                    exemplo02();
                    break;

                case 3:
                    exemplo03();
                    break;

                case 4:
                    exemplo04();
                    break;

                case 0:
                    System.out.println("\nO programa foi finalizado...\n");
                    break;

                default: // else
                    System.out.println("\nOpção iválida, digite novamente...\n");
                    break;

            }

        } while (opcao != 0); // 0 = opção para fechar o programa


    }

    public static void exemplo01() {

        System.out.println("\nInforme dois valores inteiros: ");

        System.out.print("Informe o primeiro valor: ");
        // entrada de dados a partir da classe Console
        int n1 = Console.lerInt();

        System.out.print("Informe o segundo valor: ");
        int n2 = Console.lerInt();

        float media = (float)(n1 + n2) / 2;

        System.out.println("Média dos valores: " + media);

    }

    public static void exemplo02() {

        System.out.println("\nInforme 3 alturas para calcular a média entre elas:");

        System.out.print("Primeira altura (em metros): ");
        float altura1 = Console.lerFloat();

        System.out.print("Segunda altura (em metros): ");
        float altura2 = Console.lerFloat();

        System.out.print("Terceria altura (em metros): ");
        float altura3 = Console.lerFloat();

        float mediaAltura = (altura1 + altura2 + altura3) / 3;

        // convertendo e formatando o valor de 'mediaAlturas'
        String mediaFormatada = String.format("%.2f", mediaAltura);

        System.out.println("Média das alturas: " + mediaFormatada);

    }

    public static void exemplo03() {

        System.out.println("\nCadastro de Cliente:");

        System.out.print("Informe o nome: ");
        String nome = Console.lerString();

        System.out.print("Informe a idade: ");
        int idade = Console.lerInt();

        System.out.print("Informe o e-mail: ");
        String email = Console.lerString();

        System.out.println("\nDados do Cliente:");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("E-mail:" + email);

    }

    public static void exemplo04() {

        System.out.println("\nCadastro de Cliente (com POO): ");

        // criar novo cliente:
        Cliente cliente1 = new Cliente(); // nova instância de Cliente
        // Em POO = instância = objeto criado a partir de uma Classe
        // Objeto = um tipo de dado mais complexo, que agrega outros dados.
        // No caso de Cliente, temos uma String nome, int idade e String e-mail
        // como dados (atributos) que caracterizam (definem o  que é) um Cliente

        // Para declarar uma instância de alguma classe, sempre será:
        // Classe nomeDoObjeto = new Classe();

        // Com o objeto 'cliente1' criado, podemos informar os valores de seus atributos
        System.out.print("Informe o nome do cliente: ");
        cliente1.nome = Console.lerString();

        System.out.print("Informe a idade do cliente: ");
        cliente1.idade = Console.lerInt();

        System.out.print("Informe o e-mail do cliente: ");
        cliente1.email = Console.lerString();

        System.out.println("\nCliente 1 Cadastrado:");
        System.out.println("Nome: " + cliente1.nome);
        System.out.println("Idade: " + cliente1.idade);
        System.out.println("E-mail: " + cliente1.email);

        // cadastro de segundo cliente
        // Nova instância (instância = objeto = tipo de dado da classe) de Cliente
        Cliente cliente2 = new Cliente();

        System.out.print("\nInforme o nome do segundo cliente: ");
        cliente2.nome = Console.lerString();

        System.out.print("Informe a idade do segundo cliente: ");
        cliente2.idade = Console.lerInt();

        System.out.print("Informe o e-mail do segundo cliente: ");
        cliente2.email = Console.lerString();

        System.out.println("\nCliente 2 Cadastrado:");
        System.out.println("Nome: " + cliente2.nome);
        System.out.println("Idade: " + cliente2.idade);
        System.out.println("E-mail: " + cliente2.email);


    }


}
