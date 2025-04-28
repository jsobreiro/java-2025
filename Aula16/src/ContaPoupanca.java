public class ContaPoupanca extends Conta {

    private float rendimento; // quantos % rende ao mês
    private int tempoRendimento; // quantos meses o valor está rendendo
    
    public ContaPoupanca(String nomeCliente, int numeroConta, float saldo,
                        float rendimento) {
        super(nomeCliente, numeroConta, saldo);

        this.rendimento = rendimento;
        this.tempoRendimento = 0;
    }

    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }

    public int getTempoRendimento() {
        return tempoRendimento;
    }

    public void setTempoRendimento(int tempoRendimento) {
        this.tempoRendimento = tempoRendimento;
        recalcularSaldo();
    }

    private void recalcularSaldo() {
        saldo  = saldo + ((saldo * rendimento) * tempoRendimento);
    }


    @Override
    public void sacar(float valor) {
        
        System.out.println("\nSacando R$ " + valor + "...");
        if (valor > saldo) {
            System.out.println("Saldo insuficiente! Informe outro valor.");
            return;
        }

        saldo -= valor;
        setTempoRendimento(0);
        System.out.println("Valor R$ " + valor + " sacado com sucesso da poupança!");

    }

    @Override
    public void depositar(float valor) {
        
        super.depositar(valor);
        System.out.println("Valor R$ " + valor + " depositado na poupança!");
        setTempoRendimento(0);
        System.out.println("Saldo atual: R$ " + saldo);

    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nRedimento mensal: " + rendimento + "%" +
                "\nTempo de rendimento: " + tempoRendimento + " meses";
    }

 }
