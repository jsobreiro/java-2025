
import java.util.Scanner;

public class Principal {

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        
        //exemplo01();
        //exemplo02();
        //exemplo03();
        //exemplo04();
        //exemplo05();
        //exemplo06();
        exemplo07();

    }   
    
    public static void exemplo01() {

        // somar dois valores lidos do teclado:

        System.out.println("Informe um valor inteiro: ");
        int n1 = leitor.nextInt();
        System.out.println("Informe outro valor inteiro: ");
        int n2 = leitor.nextInt();

        int soma = n1 + n2;

        System.out.println("Resultado da soma: " + soma);
    
    }

    public static void exemplo02() {

        // Ler dos valores do teclado e verificar qual o maior, ou se são iguais
        System.out.println("Informe o primeiro valor: ");
        int n1 = leitor.nextInt();

        System.out.println("Informe o segundo valor: ");
        int n2 = leitor.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " é o maior valor!");
        
        } else if (n2 > n1) {
            System.out.println(n2 + " é o maior valor!");
        
        } else {
            System.out.println("Os valores são iguais!");
        }

    }

    public static void exemplo03() {

        // exemplo for: contanto de 1 a 10:

        for (int i = 1; i <= 10; i++) {
            System.out.println("Valor atual do contador: " + i);
        }

    }

    public static void exemplo04() {
        
        // exemplo while: mostrar valores entre 
        // um número digitado pelo usuário e 100

        System.out.println("Informe um valor menor que 100");
        int n1 = leitor.nextInt();

        if (n1 >= 100) {
            System.out.println("Valor inválido. Programa finalizado");
            return; // encerra o método. Evita que o código a seguir seja executado
        }

        while (n1 <= 100) {
            System.out.println("Valor atual do contador: " + n1);
            n1++; // aumenta o valor de n1 em uma unidade
        }

    }

    public static void exemplo05() {

        // exemplo do while: repetir leitura enquanto valor 
        // digitado for inválido
        int valor;

        do {
            System.out.println("Digite um valor entre 1 e 10: ");
            valor = leitor.nextInt();

            
        } while (valor < 1 || valor > 10);

        System.out.println("Valor digitado: " + valor);

    }

    public static void exemplo06() {

        // exemplo vetor de inteiros: Ler 5 valores inteiros e 
        // armazena-los em um vetor. Mostrar os valores do vetor.

         // declaração de vetor
         int[] vetor = new int[5];
 
         // .length = retorna o tamanho do array
         for (int i = 0; i < vetor.length; i++) {
 
             System.out.print("Informe valor para a pos " + i + ": ");
             vetor[i] = leitor.nextInt(); // lê valor para pos atual do vetor
         }
 
         System.out.println("\nVetor Gerado:");
 
         for (int i = 0; i < vetor.length; i++) {
 
             System.out.print(vetor[i] + " ");
 
         }

    }
       
    public static void exemplo07() {

        /*
         * Leia um valor inteiro entre 2 e 10.
         * Enquando for digitado um valor fora desse intervalo,
         * solicite ao usuário para digitar novamente.
         * Crie um vetor com o mesmo tamanho do valor lido.
         * Leia os valores e depois apresente apenas os valores pares do
         * vetor na tela
         */

         int tamanho; // tamanho do vetor
 
         do {
             System.out.print("Informe o tamanho do vetor (entre 2 e 10): ");
             tamanho = leitor.nextInt();
         } while (tamanho < 2 || tamanho > 10);
 
         // cria vetor do tamanho indicado pela variavel "tamanho"
         int[] vetor = new int[tamanho];
 
         System.out.println("\nLeitura do vetor de " + tamanho + " pos: ");
 
         for (int i = 0; i < vetor.length; i++) {
             System.out.print("Pos " + i + ": ");
             vetor[i] = leitor.nextInt();
         }
 
         System.out.println("\nValores pares do vetor:");
         for (int i = 0; i < vetor.length; i++) {
 
             // mostrar apenas valores pares
             if (vetor[i] % 2 == 0) {
                 System.out.print(vetor[i] + " ");
             }
 
         }
 
     }

}
