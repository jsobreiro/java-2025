import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        
        GerenciadorCarros gc = new GerenciadorCarros();
        String modelo, placa, cor;
        int op;

        try {
            gc.lerArquivo();
        } catch (IOException e) {
            System.out.println("\nErro ao ler arquivo!");
        }

        do { 
            
            System.out.println("\nGERENCIADOR DE CARROS");
            System.out.println("1) Cadastrar Carro");
            System.out.println("2) Listar Carros cadastrados");
            System.out.println("3) Remover carro");
            System.out.println("0) Sair");
            System.out.print("Informe uma opção: ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    
                    System.out.println("\nCadastro:");
                    System.out.print("Modelo: ");
                    modelo = Console.lerString();

                    System.out.print("Placa: ");
                    placa = Console.lerString();

                    System.out.print("Cor: ");
                    cor = Console.lerString();

                    try {
                        gc.adicionarCarro(new Carro(modelo, placa, cor));
                      
                    } catch (IOException e) {
                        System.out.println("Erro ao gravar no arquivo de texto:");
                        e.printStackTrace(); 
                    }

                    break;

                case 2:

                    try {
                        gc.listarCarros();
                    } catch (IOException e) {
                        System.out.println("Erro ao ler arquivo de texto:");
                        e.printStackTrace();       
                    }  

                    break;

                case 3:

                    System.out.println("\nInforme a placa do carro que deseja remover: ");
                    placa = Console.lerString();

                    try {
                        gc.removerCarro(placa);
                    } catch (IOException e) {
                        System.out.println("\nErro ao atualizar o arquivo:");
                        e.printStackTrace();
                    }

                    break;

                case 0:

                    System.out.println("\nO programa foi finalizado...");
                    break;

                default:
                    System.out.println("\nOpção inválida! digite novamente.");
                    break;
            }

        } while (op != 0);





       

        


    }

}
