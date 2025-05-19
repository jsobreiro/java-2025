public class Principal {

    public static void main(String[] args) {
        
        // exemploExeption1();
        // exemploExeption2();
        exemploException3();

    }

    private static void exemploExeption1() {

        System.out.print("Informe um valor inteiro: ");
        int valor = Console.lerInt();
        System.out.println("Valor informado: " + valor);

        System.out.print("\nAgora, digte um valor real: ");
        float valor2 = Console.lerFloat();
        System.out.println("Valor informado: " + valor2);

        System.out.print("\nPor fim, digite uam string: ");
        String valor3 = Console.lerString();
        System.out.println("String informada: " + valor3);
    }

    private static void exemploExeption2() {

        ContaCorrente conta1 = new ContaCorrente("Fulano da Silva", 1500f);

        System.out.println("\nTentando sacar 2000 da conta...");
        try { // tentar realizae um saque
            conta1.sacar(2000);
        } catch (SaldoInsuficienteException e) { 
            // se o valor for > saldo, a exceção será lançada, e aqui, capturamos ela
            System.out.println(e.getMessage()); // mostramos a msg de exceção personalizada
        }

        System.out.println("\nDepositando 1000 na conta...");
        conta1.depositar(1000);

        System.out.println("\nTentando sacar 2400 da conta...");

        try {
            conta1.sacar(2400);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nExtrato da conta:");
        conta1.extrato();

    }

    private static void exemploException3(){

        while (true) { 
            
            try{

                System.out.println("\nCalculadora:");
                System.out.print("Informe o primeiro valor: ");
                float n1 = Console.lerFloat();

                System.out.print("Informe o segundo valor: ");
                float n2 = Console.lerFloat();

                System.out.print("Informe a operações (+, -, *, /): ");
                String op = Console.lerString();

                float resultado = Calculadora.calcular(n1, n2, op);
                System.out.println("Resultado: " + resultado);

                break;// encerra o laço se executou corretamente

            } catch (OperacaoInvalidaException e) {
                System.out.println(e.getMessage());
            
            } catch (ArithmeticException e) {
                System.out.println("Erro aritmético: " + e.getMessage());
            
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }

        }
        System.out.println("\nPrograma finalizado...\n");

    }

}
