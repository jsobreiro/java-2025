public class Programador extends Funcionario{

    private float horasExtras;


    public Programador(String nome, float horasTrab, float valorHora, 
    float horasExtras) {
        super(nome, horasTrab, valorHora);
        this.horasExtras = horasExtras;
        calcularFolha();
    }

    @Override
    public void calcularSalbruto() {
        salBruto = (getHorasTrab() + horasExtras) * getValorHora();
    }
    
    public float getHorasExtras() {
        return horasExtras;
    }
    
    public void setHorasExtras(float horasExtras) {
        this.horasExtras = horasExtras;
        calcularFolha();
    }
    
    @Override
    public String toString() {
        return  "\nCargo: Programador" +
                super.toString() +
                "\nHoras extras: " + horasExtras + "h" +
                "\nSalário Bruto: R$" + salBruto +
                "\nSalário Líquido: R$" + getSalLiq();
    }
    

    

    

}
