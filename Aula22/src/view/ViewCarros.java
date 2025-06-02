package view;
import console.Console;
import controller.CarroController;
import java.util.List;
import model.Carro;

public class ViewCarros {

    private CarroController controller = new CarroController();


    private void exibirMenu() {
        System.out.println("\n===GERENCIADOR DE CARROS===");
        System.out.println("1) Cadastrar Carro");
        System.out.println("2) Listar Carros");
        System.out.println("3) Excluir Carro pela Placa");
        System.out.println("0) Sair");
    }

    public void iniciar() {
        int op; // opção do menu
        controller.carregarDoArquivo(); // tentamos ler arquivo de texto antes de iniciar 
        do { 

            exibirMenu();
            System.out.print("Informe uma opção: ");
            op = Console.lerInt();
            validarOpcao(op);

        } while (op != 0);
    }

    public void validarOpcao(int op) {

        switch (op) {
            case 1:
                // cadastrarCarro
                cadastrarCarro();
                break;

            case 2:
                // listar carros cadastrados
                listarCarros();
                break;

            case 3:
                // remover carro
                excluirCarro();
                break;
            
            case 0:
                // sair
                System.out.println("\nO programa foi finalizado...\n");
                break;

            default:
                System.out.println("\nOpção inválida! Digite novamente.\n");;
        }

    }

    private void cadastrarCarro() {

        System.out.print("\nModelo: ");
        String modelo = Console.lerString();

        System.out.print("Placa: ");
        String placa = Console.lerString();

        System.out.print("Cor: ");
        String cor = Console.lerString();

        // adicionar carro na lsita local (que, por sua vez, vai salvar no arquivo)
        controller.adicionarCarro(new Carro(modelo, placa, cor));

        System.out.println("\nCarro cadastrado com sucesso!");

    }

    private void listarCarros() {

        List<Carro> listaCopia = controller.getListaCarros();

        // se a lista estiver vazia, ainda não há carros cadastrados
        if (listaCopia.isEmpty()) {
            System.out.println("\nATENÇÃO: Não há carros cadastrados\n");
            return;
        }

        System.out.println("\n===Carros Cadastrados===");

        for (Carro temp : listaCopia) {
            
            System.out.println(temp); // invocando o toString do objeto no momento de mostrar na tela
        }


    }

    private void excluirCarro() {

        if (controller.getListaCarros().isEmpty()) {
            System.out.println("\nNão há carros cadastrados. Impossível remover!");
            return;
        }

        System.out.print("\nInforme a placa: ");
        String placa = Console.lerString();

        // booleana para receber o resultado do método que tenta excluir carro do arquivo:
        boolean resultado = controller.excluirCarro(placa);

        if (!resultado) { // se o resultado for 'false'
            System.out.println("\nCarro com a placa " + placa + " não localizado!");
            System.out.println("Tente novamente informando outra placa.");
            return;
        }

        // se chegou aqui, deu tudo certo!
        System.out.println("Carro com a placa " + placa + " removido com sucesso!");

    }

}
