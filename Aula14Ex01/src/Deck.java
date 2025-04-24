import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Carta> deck;

    public Deck() {
        deck = new ArrayList<>();
    }

    public void adicionarCarta(Carta carta) {
        deck.add(carta);
        System.out.println("\nCarta adicionada: " + carta + "\n");
    }

    public void listarCartas() {
        System.out.println("\nCartas Cadastradas:");
        for (Carta tempCarta : deck) {
            System.out.println(tempCarta);
        }
    }

    public void removerCartas() {
        deck.clear();
        System.out.println("\nTodas as cartas foram removidas do deck!");
    }

    public boolean naipeCadastrado(String naipe) {
        
        for (Carta tempCarta : deck) {
            if (tempCarta.getNaipe().equals(naipe)) {
                return true;
            }
        }

        return false;
    }

    public boolean cartaCadastrada(Carta carta) {
        for (Carta tempCarta : deck) {
            if (tempCarta.getNaipe().equals(carta.getNaipe()) &&
                tempCarta.getValor() == carta.getValor()) {
                return true;
            }
        }

        return false;
    }

    public void listarCartasMesmoNaipe(String naipe) {

        System.out.println("Cartas de " + naipe + ":");
        for (Carta tempCarta : deck) {
            if (tempCarta.getNaipe().equals(naipe)) {
                System.out.println(tempCarta);
            }
        }

    }

    public boolean verificarDeckVazio() {
        return deck.isEmpty();
    }

}
