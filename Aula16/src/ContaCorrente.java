public class ContaCorrente extends Conta{

    private float chequeEspecial;
    private float saldoReal;

    public ContaCorrente(String nomeCliente, int numeroConta, float saldo, 
                         float chequeEspecial) {
        super(nomeCliente, numeroConta, saldo);
        this.chequeEspecial = chequeEspecial;
        saldoReal = saldo + chequeEspecial;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    
    @Override
    public void sacar(float valor) {
        System.out.println("\nSacar: R$ " + valor);
        if (valor > saldoReal) {
                System.out.println("Saldo insuficiente! Informe outro valor");
                return; // encerra  o método
        }

        saldo -= valor; // sacamos um valor
        atualizarSaldoReal();

        System.out.println("Valor retirado com sucesso!");
    }

    @Override
    public void depositar(float valor) {

        saldo += valor;
        atualizarSaldoReal();

        System.out.println("\nValor R$ " + valor + " depositado com sucesso!");
    }

    private void atualizarSaldoReal() {
        saldoReal = saldo + chequeEspecial; // atualiza o saldo atual
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "\nCheque especial: R$" + chequeEspecial +
                "\nSaldo Real (saldo + cheque especial): R$ " + saldoReal;
    }



}
