public abstract class Funcionario {

    private String nome;
    private float horasTrab;
    private float valorHora;
    protected float salBruto;
    private float ir;
    private float inss;
    private float fgts;
    private float salLiq;
    
    public Funcionario(String nome, float horasTrab, float valorHora) {
        this.nome = nome;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
        // TODO: chamar método que realizará todos os cálculos
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

    public float getValorHora() {
        return valorHora;
    }

    public float getSalBruto() {
        return salBruto;
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

    public float getSalLiq() {
        return salLiq;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
        calcularFolha();
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
        calcularFolha();
    }   
    
    // O cálculo do salário bruto será diferente de acordo com o tipo de funconário
    protected abstract void calcularSalbruto();

    private void calcularIR() {

        if (salBruto <= 1372.81f) {
            ir = 0;
            return;
        }

        if (salBruto <= 2743.25f) {
            ir = salBruto * 0.15f;
            return;
        }

        ir = salBruto * 0.275f;

    }

    private void calcularINSS() {

        if (salBruto <= 868.29f) {
            inss = salBruto * 0.08f;
            return;
        }

        if (salBruto <= 1447.14f){
            inss = salBruto * 0.09f;
            return;
        }

        if (salBruto <= 2894.27f) {
            inss = salBruto * 0.11f;
            return;
        }

        inss = 318.37f;

    }

    private void calcularFGTS() {
        fgts = salBruto * 0.11f;
    }

    private void calcularSalLiq() {
        salLiq = salBruto - ir - inss;
    }

    protected void calcularFolha() {
        calcularSalbruto();
        calcularIR();
        calcularINSS();
        calcularFGTS();
        calcularSalLiq();
    }

    @Override
    public String toString() {
        return  "\nNome do Funcionário: " + nome + 
                "\nHoras trabalhadas: " + horasTrab + "h" +
                "\nValor da hora: R$" + valorHora + 
                "\nIR: R$ " + ir +
                "\nINSS: R$ " + inss +
                "\nFGTS: R$ " + fgts;
    }


    


}
