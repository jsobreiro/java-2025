public class Carta {
    
    private int valor;
    private String naipe;

    public Carta(int valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        
        String carta;
        carta = switch (valor) {
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            case 14 -> "Às";
            default -> valor + "";
        };
        
        return carta + " de " + naipe;
    }


}
