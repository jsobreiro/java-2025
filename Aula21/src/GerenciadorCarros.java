
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GerenciadorCarros {

    private static final String ARQUIVO  = "carros.txt";

    public void adicionarCarro(Carro c) throws IOException {

        try (PrintWriter pw =   new PrintWriter(new BufferedWriter(new FileWriter(ARQUIVO, true)))) {
            pw.println(c.toTxt());
        } 
    }

    public void listarCarros() throws  IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {

            String carroAtual;

            while((carroAtual = br.readLine()) != null) {

                Carro carro = Carro.fromTxt(carroAtual);
                System.out.println(carro);

            }

        }

    }

}
