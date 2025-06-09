package view;
import console.Console;
import controller.PokeDex;
import model.MoveSet;
import model.Pokemon;

public class Principal {

    private static PokeDex pokeDex = new PokeDex();
    public static void main(String[] args) {
        

        pokeDex.carregar();

        if (!pokeDex.getListaPokemon().isEmpty()) {

            listarPokemons();

            removerPokemon();

            return;
        }

        inicializar(); 
        
        listarPokemons();

        removerPokemon();


    }

    private static void listarPokemons () {
        System.out.println("Pokemons Cadastrados:");
            
            for (Pokemon pkmn : pokeDex.getListaPokemon()) {

                System.out.println(pkmn);

            }
    }

    private static void removerPokemon () {

        System.out.print("\nInforme o nome do pokémon que deseja excluir: ");
        String nome = Console.lerString();
         
        if (pokeDex.remover(nome)){         
            System.out.println("\nPokémon removido!");
        } else {
            System.out.println("\nPokémon não localizado para remover...");
        }
 
        listarPokemons();

    }

    private static void inicializar() {

        pokeDex.adicionar(new Pokemon("Bulbasauro", "Grama", 
                          new MoveSet("Mordida", "Corte", "Folha navalha", "Raio Solar")));      

        pokeDex.adicionar(new Pokemon("Charmander", "Fogo", 
                          new MoveSet("Mordida", "Corte", "Cavar", "Chama")));      

        pokeDex.adicionar(new Pokemon("Squirtle", "Água", 
                          new MoveSet("Mordida", "Investida", "Bolhas", "Surf")));      

        pokeDex.adicionar(new Pokemon("Pikachu", "Elétrico", 
                          new MoveSet("Agilidade", "Investida", "Choque do Trovão", "Calda de Ferro")));
                 

    }

}
