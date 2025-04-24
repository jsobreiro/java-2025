public class Professor {

    private String nome;
    private String especialidade;
    private String email;
    private Departamento departamento;

    public Professor(String nome, String especialidade, String email, Departamento departamento) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.email = email;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return  "Nome do professor: " + nome +
                "\nEspecialidade: " + especialidade + 
                "\nE-mail: " + email + "\n" +
                departamento.toString();
    }

    

    

}
