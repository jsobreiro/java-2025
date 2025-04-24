
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        // chamar método exemplo01
        //exemplo01();
        //exemplo02();
        exemplo03();

    }

    public static void exemplo01() {

        // saída básica da linguagem
        System.out.println("Aula 03 - Java");
        // println: mostra algo na tela, e quebra uma linha

        System.out.print("Aluno: ");
        System.out.print("Jason Sobreiro\n");
        // print: mostra algo na tela, sem quebra de linha ao final
        // \n dentro de uma string, realiza uma quebra de linha
        
        // declaração de variáveis simples
        String curso = "ADS";
        int periodo = 3;
        String disciplina = "Desenvolvimento de Software";
        float mediaAtual = 6.5f; // f = indica valor float

        // mostrar variáveis na tela
        System.out.println("Curso: " + curso); // + = concatenação
        System.out.println("Período: " + periodo + "º");
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Média atual: " + mediaAtual);

        System.out.print("Situação atual na disciplina: ");
        // condicional simples:
        if (mediaAtual >= 6) {
            // aprovado
            System.out.print("Aprovado");
        } else {
            // pendente
            System.out.print("Pendente");
        }

    }

    public static void exemplo02() {

        // para entrada de dados, precisamos criar uma "variável",
        // que será responsável por efetuar a leitura dos dados
        Scanner leitor = new Scanner(System.in);
        // para ler inteiros: leitor.nextInt()
        // para ler flot: leitor.nextFloat()
        // para ler String: leitor.nextLine()

        // Calculadora básica de IMC: peso / (altura * altura)
        String nome;
        float peso;
        float altura;

        System.out.print("Por favor, informe seu nome: ");
        nome = leitor.nextLine();

        System.out.print("Informe seu peso (em Kg): ");
        peso = leitor.nextFloat();

        System.out.print("Informe sua altura (em metros): ");
        altura = leitor.nextFloat();

        // teste temporário
        // System.out.println(nome + "\n" + peso + "\n" + altura);

        System.out.println("\nPaciente: " + nome);

        float imc = peso / (altura * altura); 
        System.out.println("IMC: " + imc);

        String classificacao;

        // operadores lógicos:
        // E - &&
        // OU - ||
        // NÃO - !

        if (imc < 18.5f) {
            classificacao = "Magreza";
        
        } else if (imc <= 24.9f) {
            classificacao = "Normal";

        } else if (imc <= 29.9f) {
            classificacao = "Sobrepeso";

        } else if (imc <= 34.9f) {
            classificacao = "Obesidade Grau 1";
        
        } else if (imc <= 39.9f) {
            classificacao = "Obesidade Grau 2 (Severa)";
        
        } else {
            classificacao = "Obesidade Grau 3 (Mórbida)";
        }

        System.out.println("Classificação: " + classificacao);

    }

    public static void exemplo03() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe dois valores inteiros:");

        System.out.print("Valor 1: ");
        int n1 = leitor.nextInt();

        System.out.print("Valor 2: ");
        int n2 = leitor.nextInt();

        int soma = n1 + n2;
        int subt = n1 - n2;
        int mult = n1 * n2;
        float divi = n2 == 0 ? 0 : (float)n1 / (float)n2; // operador ternário

        // o (float) antes das variáveis é chamado de type cast
        // type cast: converter o valor de uma variável para outro tipo ANTES de executar alguma operação

        // ternário é a mesma coisa que fazer:
        
        /* 
        if (n2 == 0) {
            divi = 0;
        } else {
            divi = n1 / n2;
        } 
         */

         System.out.println(n1 + " + " + n2 + " = " + soma);
         System.out.println(n1 + " - " + n2 + " = " + subt);
         System.out.println(n1 + " * " + n2 + " = " + mult);
         System.out.println(n1 + " / " + n2 + " = " + divi);

    }

}
