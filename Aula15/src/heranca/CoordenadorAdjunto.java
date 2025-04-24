package heranca;

public class CoordenadorAdjunto  extends Coordenador{

    private String responsabilidades;

    public CoordenadorAdjunto(String nome, int matricula, 
    String curso, String responsabilidades) {
        super(nome, matricula, curso);
        this.responsabilidades = responsabilidades;
    }

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "\nResponsabilidades do adjunto: " + responsabilidades;
    }

    

    

}
