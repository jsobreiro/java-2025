public class Gerente extends Funcionario{

    private float bonificacao;

    public Gerente(String nome, float horasTrab, float valorHora, float bonificacao) {
        super(nome, horasTrab, valorHora);
        this.bonificacao = bonificacao;
        calcularFolha();
    }

    public float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
        calcularFolha();
    }

    @Override
    public void calcularSalbruto() {
        salBruto = getHorasTrab() * getValorHora() + bonificacao;
    }

    @Override
    public String toString() {
        return  "\nCargo: Gerente" +
                super.toString() +
                "\nBonificação do Gerente: R$" + bonificacao +
                "\nSalário Bruto: R$" + salBruto +
                "\nSalário Líquido: R$" + getSalLiq();
    }   
    

}
