package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import model.Personagem;

public class PersonagemController {

    private static final String ARQUIVO = "personagens.txt";
    private List<Personagem> listaPersonagens;

    public PersonagemController() {
        listaPersonagens = new ArrayList<>();
    }

    public void salvarNoArquivo(Personagem p) {

        try (PrintWriter pw = new PrintWriter(new FileWriter(ARQUIVO, true))) {
            pw.println(p.toText());
        } catch (IOException e) {
            System.err.println("Erro ao salvar personagem no arquivo: " + e.getMessage());
        }

    }

    // a sobrecarga abaixo será utilizada quando excluirmos um personagem do arraylist
    public void salvarNoArquivo() {

        try (PrintWriter pw = new PrintWriter(new FileWriter(ARQUIVO))) {
           
            for (Personagem temp : listaPersonagens) {

                pw.println(temp.toText());

            }

        } catch (IOException e) {
            System.err.println("Erro ao salvar personagem no arquivo: " + e.getMessage());
        }

    }

    public void salvarPersonagem(Personagem p) {
        listaPersonagens.add(p);
        salvarNoArquivo(p);
    }

    public List<Personagem> getListaPersonagens() {
        
        if (listaPersonagens.isEmpty()) {
            return null; // nada para exibir
        }
        
        return listaPersonagens;
    }

    public void lerDoArquivo() {
        listaPersonagens.clear();

        File file = new File(ARQUIVO);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            
            String personagemAtual;

            while ((personagemAtual = br.readLine()) != null) {
                Personagem p = Personagem.fromText(personagemAtual);
                
                if (p != null) {
                    listaPersonagens.add(p);
                }
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo de texto: " + e.getMessage());
        }
    }


}
