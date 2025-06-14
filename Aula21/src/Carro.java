public class Carro {

    private String modelo;
    private String placa;
    private String cor;
    
    public Carro(String modelo, String placa, String cor) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return  "Modelo: " + modelo + "\n" +
                "Placa: " + placa + "\n" + 
                "Cor: " + cor + "\n";
    }

    public String toTxt(){
        return  modelo + ";" + placa + ";" + cor;
    }

    public static Carro fromTxt(String txt) {
        String[] partesCarro = txt.split(";");
        return new Carro(partesCarro[0], partesCarro[1], partesCarro[2]);
    }
    

}
