import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    // método para ler valores inteiros do teclado
    public static int lerInt() {

        int valor = leitor.nextInt(); // ler valor de teclado e armazenar na variável 'valor'
        leitor.nextLine(); // limpar o buffer de entrada antes da próxima leitura
        return valor; // retornar valor armazenado
    }

    // método para ler valores reais (float) do teclado
    public static float lerFloat() {

        float valor = leitor.nextFloat();
        leitor.nextLine();
        return valor;
    }

    // método para ler Strings do teclado
    public static String lerString() {

        String valor = leitor.nextLine(); // método do Scanner para entrada de strings

        return valor;
    }


    

}
