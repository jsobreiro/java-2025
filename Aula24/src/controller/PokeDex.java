package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Pokemon;

public class PokeDex {

    private static final String ARQUIVO = "pokedex.txt";
    private List<Pokemon> listaPokemon;

    public PokeDex() {
        listaPokemon = new ArrayList<>();
    }


    // carregar (ler) dados de txt
    public void carregar() {

         File file = new File(ARQUIVO);

         if (!file.exists()) { return; }

         listaPokemon.clear();

         try (BufferedReader br = new BufferedReader(new FileReader(file))) {
             
            String pokemonAtual;

            while ((pokemonAtual = br.readLine()) != null) {

                listaPokemon.add(Pokemon.fromText(pokemonAtual));

            }

         } catch (IOException e) {
            System.err.println("Erro ao carregar dados do arquivo: " + e.getMessage());
         }

         
        }
        
        public void salvar(Pokemon pkmn) {

            try (PrintWriter pw = new PrintWriter(new FileWriter(ARQUIVO, true))){
                
                pw.println(pkmn.toText());

            } catch (IOException e) {
                System.err.println("Erro ao salvar no arquivo de texto: " + e.getMessage());
            }

        }

        public void salvar() {

            try (PrintWriter pw = new PrintWriter(new FileWriter(ARQUIVO))){
                
                for (Pokemon pkmn : listaPokemon) {
                    pw.println(pkmn.toText());
                }

            } catch (IOException e) {
                System.err.println("Erro ao salvar no arquivo de texto: " + e.getMessage());
            }

        }

        public void adicionar(Pokemon pkmn) {
            listaPokemon.add(pkmn);
            salvar(pkmn);
        }

        public boolean remover(String nome) {
            
            for (Pokemon temp : listaPokemon) {

                if (temp.getNome().equals(nome)){
                    listaPokemon.remove(temp);
                    salvar(); // sobrescrever o txt com base nos novos dados da lista
                    carregar();
                    return true;
                }

            }
            
            return false;  // não existe na lista pokemon com o nome igual ao informado        
            
        }

        public List<Pokemon> getListaPokemon() {
            return Collections.unmodifiableList(listaPokemon);
        }

}
