public class ContaCorrente {

    private String cliente;
    private float saldo;

    public ContaCorrente(String cliente, float saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void extrato() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo em conta: " + saldo);
    }

    public void sacar(float valor) throws SaldoInsuficienteException{
        if(saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar: " + valor);
        }

        // se a exceção acima for lançada, o código abaixo não será executado
        saldo -= valor;
        System.out.println("Valor sacado: " + valor);
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Valor depositado: " + valor);
    }

}
