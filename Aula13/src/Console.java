
import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static String lerString() {
        return leitor.nextLine();
    }

    public static int lerInt() {
        int valor = leitor.nextInt(); // lê valor int do teclado
        leitor.nextLine(); // limpa buffer de entrada
        return valor; // retorna valor lido
    }

}
