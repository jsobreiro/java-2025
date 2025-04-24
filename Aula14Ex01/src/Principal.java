public class Principal {

    public static void main(String[] args) {
        
        int op;
        int opNaipe;
        String naipe;
        Deck deck = new Deck();

        do {

            System.out.println("\nDeck de Cartas");
            System.out.println("1) Adicionar carta");
            System.out.println("2) Listar cartas cadastradas");
            System.out.println("3) Remover todas as cartas");
            System.out.println("4) Mostrar cartas de um naipe específico");
            System.out.println("0) Sair do sistema");
            System.out.print("Informe uma opção: ");
            op = Console.lerInt();

            switch (op) {

                case 1:

                    System.out.println("\nAdicionar Carta:");
                    int valor;
                    
                    do {

                        System.out.print("\nInforme o valor (2 a 14): ");
                        valor = Console.lerInt();

                    } while (valor < 2 || valor > 14);

                    do { 

                        System.out.println("\nNaipes:");
                        System.out.println("1) Copas");
                        System.out.println("2) Ouros");
                        System.out.println("3) Paus");
                        System.out.println("4) Espadas");
                        System.out.print("\nInforme o naipe: ");
                        opNaipe = Console.lerInt();


                    } while (opNaipe < 1 || opNaipe > 4);

                    naipe = switch(opNaipe) {
                        case 1 -> "Copas";
                        case 2 -> "Ouros";
                        case 3 -> "Paus";
                        case 4 -> "Espadas";
                        default -> "Copas";                        
                    };

                    Carta carta = new Carta(valor, naipe);

                    if (deck.cartaCadastrada(carta)) {
                        System.out.println("\nCarta já cadastrada!");
                        break;
                    }

                    deck.adicionarCarta(carta);
                
                    break;

                case 2:

                    if (deck.verificarDeckVazio()) {
                        System.out.println("\nAinda não há cartas cadastradas");
                        break;
                    }

                    deck.listarCartas();

                    break;

                case 3:

                    if (deck.verificarDeckVazio()) {
                        System.out.println("\nAinda não há cartas cadastradas");
                        break;
                    }

                    deck.removerCartas();

                    break;

                case 4:
                    
                    if (deck.verificarDeckVazio()) {
                        System.out.println("\nAinda não há cartas cadastradas");
                        break;
                    }

                    do { 

                        System.out.println("\nNaipes:");
                        System.out.println("1) Copas");
                        System.out.println("2) Ouros");
                        System.out.println("3) Paus");
                        System.out.println("4) Espadas");
                        System.out.print("\nInforme o naipe: ");
                        opNaipe = Console.lerInt();


                    } while (opNaipe < 1 || opNaipe > 4);

                    naipe  = switch(opNaipe) {
                        case 1 -> "Copas";
                        case 2 -> "Ouros";
                        case 3 -> "Paus";
                        case 4 -> "Espadas";
                        default -> "Copas";                        
                    };

                    if (!deck.naipeCadastrado(naipe)) {
                        System.out.println("\nNaipe não cadastrado");
                        break;
                    }

                    deck.listarCartasMesmoNaipe(naipe);

                    break;

                case 0:

                    System.out.println("\nO sistema foi finalizado...");
                    break;

                default:

                    System.out.println("\nOpção inválida! Digite novamente.");
                    break;
            }

        } while (op != 0);

    }

}
