
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorCarros {

    private static final String ARQUIVO  = "carros.txt";
    private static List<Carro> listaCarros;

    public GerenciadorCarros() {
        listaCarros = new ArrayList<>();
    }

    public void adicionarCarro(Carro c) throws IOException {

        try (PrintWriter pw =   new PrintWriter(new BufferedWriter(new FileWriter(ARQUIVO, true)))) {
            pw.println(c.toTxt());
            System.out.println("\nCarro cadastrado com sucesso!\n");
        } 
        lerArquivo();
    }

    public void listarCarros() throws  IOException {

        if (listaCarros.isEmpty()) {
            System.out.println("\nATENÇÃO: Não há carros cadastrados!");
            return;
        }

        System.out.println("\nCarros Cadastrados:\n");

        for (Carro temp : listaCarros) {
            System.out.println(temp);
        }
        

    }

    public void lerArquivo() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {

            String carroAtual;

            listaCarros.clear(); // limpar a lista antes de ler o arquivo

            while((carroAtual = br.readLine()) != null) {

                // Cada linha do arquivo será convertida num objeto de Carro, que por sua vez,
                // será adiciomado no arraylist
                listaCarros.add(Carro.fromTxt(carroAtual));
            }

        }

    }

    public void removerCarro(String placa) throws IOException {

        boolean encontrou = false;

        for (Carro temp : listaCarros) {

            if (temp.getPlaca().equals(placa)) {
                listaCarros.remove(temp);
                encontrou = true;
                break;
            }

        }

        if (!encontrou) {
            System.out.println("Carro com a placa " + placa + " nao cadastrado!");
            return;
        }

        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(ARQUIVO, false)))){

            for (Carro temp : listaCarros) {
                pw.println(temp.toTxt());
            }
            System.out.println("\nCarro com a placa " + placa + " removido com sucesso!");

        }


    }

}
