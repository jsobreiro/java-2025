public class Principal {

    public static void main(String[] args) {
        
        int op; // variavel para testar as opções do menu
        Estacionamento estacionamento = new Estacionamento("Parkar", 2);

        do {

            System.out.println("\nEstacionamento " + estacionamento.getNome());
            System.out.println("1) Estacionar carro");
            System.out.println("2) Liberar carro");
            System.out.println("3) Listar carros estacionados");
            System.out.println("0) Sair");
            System.out.print("Informe uma opção: ");
            op = Console.lerInt();

            switch(op) {

                case 1: // estacionar carro

                    if(estacionamento.getQtdeCarrosEstacionados() == estacionamento.getLimiteCarros()) {
                        System.out.println("\nNão há como estacionar mais carros. Limite atingido!");
                        break;
                    }
                
                    System.out.println("\nInforme os dados do carro para estacionar:");
                    System.out.print("Modelo: ");
                    String modelo = Console.lerString();

                    System.out.print("Placa: ");
                    String placa = Console.lerString();

                    System.out.print("Cor: ");
                    String cor = Console.lerString();

                    estacionamento.estacionar(new Carro(modelo, placa, cor));

                    break;

                case 2: // liberar carro (sair)

                    if (estacionamento.getQtdeCarrosEstacionados() == 0)  {
                        System.out.println("\nAinda não há carros estacionados...");
                        break;
                    }
                                
                    System.out.print("\nInforme a placa do carro para liberar: ");
                    String pesquisa = Console.lerString();

                    estacionamento.sair(pesquisa);

                    break;

                case 3:
                    
                    if (estacionamento.getQtdeCarrosEstacionados() == 0)  {
                        System.out.println("\nAinda não há carros estacionados...");
                        break;
                    }

                    estacionamento.listarCarrosEstacionados();

                    break;

                case 0: // sair
                    System.out.println("\nO sistema foi finalizado...");
                    break;
                
                default: // opção inválida
                    System.out.println("\nOpção inválida! Digite novamente!");
                    break;

            }

        } while (op != 0);


    }

}
