
import java.util.Scanner;

public class Principal {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        

        int op; // opçao do menu
        Heroi heroi = new Heroi(); // instância do Heroi

        do { 

            System.out.println("Menu");
            System.out.println("1) Cadastrar Herói");
            System.out.println("2) Exibir dados do Herói");
            System.out.println("3) Atacar!");
            System.out.println("0) Sair");
            System.out.print("Informe uma opção: ");
            op = leitor.nextInt();
            leitor.nextLine(); // limpar o buffer

            switch(op) {

                case 1:
                    // cadastrar
                    System.out.println("\nCadastro de Herói:\n");
                    System.out.println("Nome: ");
                    heroi.setNome(leitor.nextLine());

                    System.out.println("Raça: ");
                    heroi.setRaca(leitor.nextLine());

                    System.out.println("Golpe especial: ");
                    heroi.setGolpeEspecial(leitor.nextLine());

                    System.out.println("\nHerói cadastrado com sucesso!\n");
                    break;
                    
                case 2:
                    // exibir dados do herói


                    if (heroi.getNome() == null) {
                        System.out.println("\nCadastre um herói antes de exibir seus dados\n");
                    } else {

                        System.out.println("\nDados do Herói\n:");
                        System.out.println(heroi.toString());
                        System.out.println();
                    }


                    break;

                case 3:
                    // herói vai atacar!
                    if (heroi.getNome() == null) {
                        System.out.println("\nCadastre um herói antes de atacar o inimigo!\n");
                    } else {

                        heroi.atacar();
                        System.out.println();
                    }

                    break;

                case 0:
                    // sair do sistema
                    System.out.println("\nO sistema foi finalizado...\n");
                    break;

                default:
                    System.out.println("\nOpção inválida! Digite novamente\n");
                    break;

            }

            
        } while (op != 0);

    }


}
