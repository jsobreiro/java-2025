public class FolhaPagamento {

    private String nomeFuncionario;
    private float horasTrabalhadas;
    private float valorHora;
    private float salarioBruto;
    private float ir;
    private float inss;
    private float fgts;
    private float salarioLiquido;

    public FolhaPagamento(String nomeFuncionario, float horasTrabalhadas, float valorHora) {
        this.nomeFuncionario = nomeFuncionario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;

        calcularFolhaPagamento();
    }

    // getters
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public float getIr() {
        return ir;
    }

    public float getInss() {
        return inss;
    }

    public float getFgts() {
        return fgts;
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    // setters
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        calcularFolhaPagamento();
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
        calcularFolhaPagamento();
    }

    private void calcularSalBruto() {
        salarioBruto = horasTrabalhadas * valorHora;
    }

    private void calcularIR() {

        if (salarioBruto <= 1372.81f) {
            ir = 0;

        } else if (salarioBruto <= 2743.25f) {
            ir = salarioBruto * 0.15f;

        } else {
            ir = salarioBruto * 0.275f;

        }

    }

    private void calcularINSS() {

        if (salarioBruto <= 868.29f) {
            inss = salarioBruto * 0.08f;

        } else if (salarioBruto <= 1447.14f) {
            inss = salarioBruto * 0.09f;

        } else if (salarioBruto <= 2894.27f) {
            inss = salarioBruto * 0.11f;

        } else {
            inss = 318.17f;

        }

    }

    private void calcularFGTS() {
        fgts = salarioBruto * 0.08f;

    }

    private void calcularSalLiquido()  {
        salarioLiquido = salarioBruto - ir - inss;
    }

    private void calcularFolhaPagamento() {
        // chamar demais métodos de cálculos
        calcularSalBruto();
        calcularIR();
        calcularINSS();
        calcularFGTS();
        calcularSalLiquido();
    }

    @Override
    public String toString() {
       String dados =   "\nNome do Funcionário: " + nomeFuncionario +
                        "\nHoras trabalhadas: " + horasTrabalhadas + "h" +
                        "\nValor da hora: R$ " + valorHora +
                        "\nSalário Bruto: R$ " + String.format("%.2f", salarioBruto) +
                        "\nIR do mês: R$ " + String.format("%.2f", ir) +
                        "\nINSS do mês: R$ " + String.format("%.2f", inss) +
                        "\nFGTS: R$ " + String.format("%.2f", fgts) +
                        "\n----------------------------" +
                        "\nSalário Líquido: R$ " + String.format("%.2f", salarioLiquido);
        return dados;
    }

    


}
