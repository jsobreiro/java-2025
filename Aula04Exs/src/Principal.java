import java.util.Scanner;

public class Principal {

    // criar variável para leitura de dados
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        // ex01();
        // ex02();
        // ex03();
        ex06();
    }

    public static void ex01() {

  
        System.out.println("Ex 01) Informe 5 valores inteiros: ");

        float media = 0; // vaiavel para calculo da média;
        int[] valores = new int[5]; // vetor de inteiros de 5 posiçoes

        for (int i = 0; i < valores.length; i++) {
            
            System.out.print( (i+1) + "º Valor :");
            valores[i] = leitor.nextInt();
            media += valores[i];
        }

        // calculo da média
        media /= 5; // media = media / 5; // media = media / valores.lenght

        // Parte equivocada do enunciado. o trecho a seguir,
        // é desnecessário para a resolução. 

        // inicializando o vetor com valores pré-determinados
        float[] vetorMedida = {media, media, media, media, media};

        //int[] exemplo = { 2, 4, 6, 8, 10 };
                // pos:   0  1  2  3  4

        // fim da parte desnecessária

        System.out.println("\nMedia dos valores lidos: " + media);

        System.out.print("Valores do vetor menores que a média: ");
        for (int i = 0; i < valores.length; i++) {
            
            if (valores[i] < media) {
                System.out.print(valores[i] + " ");
            }

        }

        System.out.print("\nValores do vetor iguais a média: ");
        for (int i = 0; i < valores.length; i++) {
            
            if (valores[i] == media) {
                System.out.print(valores[i] + " ");
            }

        }

        System.out.print("\nValores do vetor maiores que a média: ");
        for (int i = 0; i < valores.length; i++) {
            
            if (valores[i] > media) {
                System.out.print(valores[i] + " ");
            }

        }

    }

    public static void ex02() {

        System.out.println("Ex 02: Digite o tamanho do vetor (min 2): ");
        int limiteVetor = leitor.nextInt();

        // impedir que o programa continue, se o valor acima digitado
        // for menor que 2
        if (limiteVetor < 2) {
            System.out.println("Valor mínimo inválido. Programa finalizado");
            return; // encerra a execução do método
        }

        // declarar o vetor
        int[] vetorDinamico = new int[limiteVetor];

        System.out.println("Ler valores do vetor:");

        for (int i = 0; i < limiteVetor; i++) {
            
            System.out.print((i+1) + "º valor: ");
            vetorDinamico[i] = leitor.nextInt();

        }

        System.out.println("\nExibir valores do vetor:");

        for (int i = 0; i < limiteVetor; i++) {
            
            System.out.print(vetorDinamico[i] + ": ");

            if (vetorDinamico[i] > 0) {
                System.out.println("Positivo!");
            } else if (vetorDinamico[i] == 0) {
                System.out.println("Zero!");
            } else {
                System.out.println("Negativo!");
            }

        }



    }

    public static void ex03() {

        System.out.println("Ex 03) Informe o tamanho do vetor normal (min 2): ");

        int tamanho = leitor.nextInt();

        if (tamanho < 2) {
            System.out.println("Valor mínimo inválido. Programa finalizado");
            return; // encerra a execução do método
        }

        int[] valores = new int[tamanho];
        int[] dobro = new int[tamanho];

        System.out.println("Leitura dos valores do vetor normal:");

        for (int i = 0; i < tamanho; i++) {
            
            System.out.print( (i+1) + "º valor: ");
            valores[i] = leitor.nextInt(); // lendo o valor para a pos atual

            dobro[i] = valores[i] * 2; // na pos atual do vetor dobro, armazenados 
            // o dobro do valor lido acima
        }

        System.out.println("\nExibindo valores do vetor 'dobro':");
        for(int i = 0; i < tamanho; i++) {

            System.out.print(dobro[i] + " ");

        }

    }

    public static void ex06() {

        System.out.println("Ex 06) Digitar 5 notas e 5 pesos para calculo de média ponderada:");

        float[] notas = new float[5];
        int[] pesos = new int[5];
        float media = 0;
        float calculo = 0;
        float somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            
            System.out.print((i+1) + "ª nota: ");
            notas[i] = leitor.nextFloat();

            System.out.print((i+1) + "º peso: ");
            pesos[i] = leitor.nextInt();

        }

        // calculo da media
        for (int i = 0; i < notas.length; i++) {
            
            calculo += notas[i] * pesos[i];
            somaPesos += pesos[i];

        }

        media = calculo / somaPesos;

        System.out.println("Resultado da média ponderada: " + media);
        


    }

}
