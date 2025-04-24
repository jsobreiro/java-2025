public class Principal {

    public static void main(String[] args) {
        
        // ler dados do teclado
        System.out.println("FOLHA DE PAGAMENTO\n");
        System.out.print("Nome do funcionário: ");
        String nomeFuncionario = Console.lerString();

        System.out.print("Horas trabalhadas: ");
        float horasTrabalhadas = Console.lerFloat();

        System.out.print("Valor da hora: R$ ");
        float valorHora = Console.lerFloat();

        // criar instância de FolhaPagamento
        FolhaPagamento folha = new FolhaPagamento(nomeFuncionario, horasTrabalhadas, valorHora);

        // Mostrar folha de pagamento
        System.out.println(folha.toString());

    }

}
