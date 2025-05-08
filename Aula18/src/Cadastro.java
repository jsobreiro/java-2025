import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private final List<Funcionario> listaFuncionarios;

    public Cadastro() {
        // Ao criar uma instância da interface List como um ArrayList,
        // Estamos aplicando também o polimorfismo
        listaFuncionarios = new ArrayList<>();
    }

    public void cadastrar(Funcionario fun) {
        listaFuncionarios.add(fun);
    }

    public void listarTodos() {
        System.out.println("\nPercorrendo a Lista de Funcionários:\n");
        for (Funcionario temp : listaFuncionarios) {
            System.out.println(temp + "\n");
        }
    }

    

}
