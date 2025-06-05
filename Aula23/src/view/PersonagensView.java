package view;

import controller.PersonagemController;
import controller.console.Console;
import java.util.List;
import model.Heroi;
import model.Personagem;
import model.Vilao;

public class PersonagensView {

    private PersonagemController controller = new PersonagemController();

    private void exibirMenu() {

        System.out.println("\n===CADASTRO DE PERSONAGENS===");
        System.out.println("1) Cadastrar Herói");
        System.out.println("2) Cadastrar Vilão");
        System.out.println("3) Listar todos os Personangens");
        System.out.println("0) Sair");
    }

    private void verificarOpcao(int op) {

        switch (op) {
            case 1 -> cadastrarPersonagem(op);
            case 2 -> cadastrarPersonagem(op);
            case 3 -> listarPersonagens();
            case 0 -> System.out.println("\nO programa foi finalizado...\n");
            default -> System.err.println("\nATENÇÃO: Opção inválida! Digite novamente.");
        }

    }

    private void cadastrarPersonagem(int op) {

        
        switch (op) {
            case 1 -> System.out.println("\nInforme dos dados do Herói:");
            case 2 -> System.out.println("\nInforme dos dados do Vilão:");
            default -> {
                System.err.println("ERRO: Não é possível cadastrar personagem");
                return;
            }
        }

        System.out.print("Nome: ");
        String nome = Console.lerString();

        System.out.print("Pontos de Vida: ");
        int hp = Console.lerInt();

        System.out.print("Poder de Ataque: ");
        int atk = Console.lerInt();

        System.out.print("Poder de Defesa: ");
        int def = Console.lerInt();

        if (op == 1) {
            System.out.print("Habilidade Especial: ");
            String habilidade = Console.lerString();

            controller.salvarPersonagem(new Heroi(nome, hp, atk, def, habilidade));

            System.out.println("\nHerói cadastrado com sucesso!");
        
        } else {
            System.out.print("Facção Inimiga ");
            String faccao = Console.lerString();

            controller.salvarPersonagem(new Vilao(nome, hp, atk, def, faccao));

            System.out.println("\nVilão cadastrado com sucesso!");
        }

    }

    private void listarPersonagens() {

        List<Personagem> listaLocal = controller.getListaPersonagens();

        if (listaLocal == null) {
            System.err.println("\nATENÇÃO: Não há personagens cadastrados!");
            return;
        }

        System.out.println("\n====Personagens Cadastrados===");
        for (Personagem temp : listaLocal) {
            System.out.println(temp);
        }

    }

    public void iniciar() {

        int op;
        controller.lerDoArquivo();

        do {

            exibirMenu();
            System.out.print("Informe uma opção: ");
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);


    }


}
