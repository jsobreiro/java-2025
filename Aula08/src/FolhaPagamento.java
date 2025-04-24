public class FolhaPagamento {

    private String funcionario;
    private float horasTrab;
    private float valorHora;
    private float salario;

    public FolhaPagamento(String funcionario, float horasTrab, float valorHora) {
        this.funcionario = funcionario;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;

        // calcular o salario
        calcularSalario();
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
        calcularSalario(); // recalcular salário, pois as
        // horas de trabalho do funcioário mudaram
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
        calcularSalario(); // recalcular salário, pois o valor da
        // hora trabalhada foi alterado
    }

    public float getSalario() {
        return salario;
    }

    private void calcularSalario() {
        salario = horasTrab * valorHora;
    }

    @Override
    public String toString() {
        
        String dados = "Funcionário: " + funcionario + "\n" +
                        "Horas trabalhadas: " + horasTrab + "\n" +
                        "Valor da Hora: R$ " + valorHora + "\n" +
                        "Salário Bruto: R$ " + salario + "\n";

        return dados;        

    }

    






    

}
