
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int op;

        do {

            System.out.println("\nExemplos Herança:");
            System.out.println("1) Exemplo Conta Corrente");
            System.out.println("2) Exemplo Conta Poupança");
            System.out.println("3) Finalizar Exemplo");
            System.out.print("Informe uma opção: ");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    exemploCC();
                    break;

                case 2:
                    exemploCP();
                    break;

                case 3:
                    System.out.println("\nO sistema foi finalizado...\n");
                    break;

                default:
                    System.out.println("\nOpção inválida! Digite novamente...\n");
                    break;
            }

        } while (op != 3);
        

    }

    public static void exemploCC() {

        // nova isntância de ContaCorrente
        ContaCorrente cc1 = new ContaCorrente("Fulano da Silva",
        1230, 500, 500);

        // Mostrando instância na tela
        System.out.println(cc1);

        // tentando sacar 1200 reais
        cc1.sacar(1200);

        // tentando sacar 500 reais
        cc1.sacar(500);

        // mostrando valores atuais da instância
        System.out.println(cc1);

        // tentando sacar 600 reais
        cc1.sacar(600);

        // tentando sacar 500 reais
        cc1.sacar(500);

        // mostrando valores atuais da instância
        System.out.println(cc1);       

        // tentando sacar 1 real
        cc1.sacar(1);

        // mostrando valores atuais da instância
        System.out.println(cc1);  

        // depositar 750 reais
        cc1.depositar(750);

        // mostrando valores atuais da instância
        System.out.println(cc1); 
    }

    public static void exemploCP() {

        // criando instância de ContaPoupanca
        ContaPoupanca cp1 = new ContaPoupanca("Beltrano Souza", 
        12341, 10000, 0.006f);

        // mostrar dados da instância
        System.out.println(cp1);

        // aumentar o tempo de rendimento para 10 meses
        cp1.setTempoRendimento(10);

        // mostrar dados atualizados da instância
        System.out.println(cp1);

        // tentando sacar 20000 reais
        cp1.sacar(20000);

        // sacar 1200 reais
        cp1.sacar(1200);

        // mostrar dados atualizados da instância
        System.out.println(cp1);

    }

}
