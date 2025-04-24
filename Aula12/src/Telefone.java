public class Telefone {

    private String numero;
    private String modelo;
    private Operadora operadora;

    public Telefone(String numero, String modelo, Operadora operadora) {
        this.numero = numero;
        this.modelo = modelo;
        this.operadora = operadora;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    @Override
    public String toString() {
        return  "Número do Telefone: " + numero +
                "\nModelo do aparelho: " + modelo +
                "\n" + operadora.toString();
    }

    

    

}
