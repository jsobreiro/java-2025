import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static String lerString() {
        return leitor.nextLine();
    }

    public static int lerInt() {
        int valor = leitor.nextInt();
        leitor.nextLine(); // limpa o buffer
        return valor;
    }

}
