package controller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import model.Carro;

public class CarroController {

    private static final String ARQUIVO = "carros.txt";
    private List<Carro> listaCarros;

    public CarroController() { listaCarros = new ArrayList<>(); }

    public void adicionarCarro(Carro c) {
        listaCarros.add(c); // adicionamos carro na lista local
        salvarNoArquivo(c); // adicionamos carro no arquivo de texto
    }

    // Esta versão do método recebe um objeto Carro e o grava numa nova linha no arquivo de texto
    public void salvarNoArquivo(Carro c) {

        try (PrintWriter pw = new PrintWriter(new FileWriter(ARQUIVO, true))) {
            
            pw.println(c.toText());

        } catch (IOException e) {
            System.err.println("Erro ao salvar dados no arquivo: " + e.getMessage());
        }

    }

    // Esta versão do método, não recebe parâmetros. Sua finalidade é sobrescrever todo o arquivo de texto.
    // Útil para quando removermos um carro de nossa lista.
    public void salvarNoArquivo() {

        try (PrintWriter pw = new PrintWriter(new FileWriter(ARQUIVO))) {
            
            for (Carro temp : listaCarros) {
                pw.println(temp.toText());
            }

        } catch (IOException e) {
                System.err.println("Erro ao salvar dados no arquivo: " + e.getMessage());
        }

    }

    public void carregarDoArquivo(){
        listaCarros.clear(); // limpamos a lista local antes de carregar carros do arquivo de texto
        File file = new File(ARQUIVO);

        // verificar se o arquivo carros.txt (constante ARQUIVO) já existe em nosso sistema
        // Se não exisitr, não temos a necessidade de prosseguir com este método
        if (!file.exists()) {
            return; // encerra o método antecipadamente
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            
            String linhaAtual; // responsável por copiar cada linha do arquivo de texto

            // ENQUANTO houverem linhas dentro do arquivo de texto, copiamos cada linha
            // (uma a cada iteração do laço) para a variável "linhaAtual"
            while ((linhaAtual = br.readLine()) != null) {
                // aqui dentro, transformaremos a linha atual em um objeto do tipo Carro.
                // em seguida, adicionaremos este carro na nossa "listaCarros"
                listaCarros.add(Carro.fromText(linhaAtual));
            }

        } catch (IOException e) {
            System.err.println("Erro ao carregar arquivo de texto: " + e.getMessage());
        }

    }

    public List<Carro> getListaCarros() {
        return listaCarros;
    }

    public boolean  excluirCarro(String placa) {

        for (Carro temp : listaCarros) {

            if (temp.getPlaca().equals(placa)){

                // remover carro com a placa encontrada do arraylist
                listaCarros.remove(temp);
                
                salvarNoArquivo();// reescrever o arquivo de texto
                carregarDoArquivo(); // recarregar dados do arquvio de texto para a lista local
                
                return true; // excluiu com sucesso

            }

        }

        return false; // se retornarmos 'false', significa que não exite carro com a placa informada

    }


}
