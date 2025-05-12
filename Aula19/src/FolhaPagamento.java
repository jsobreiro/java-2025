
import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {

    private List<Funcionario> folhaFuncionarios;

    public FolhaPagamento() {
        folhaFuncionarios = new ArrayList<>();
    }

    public void salvarFolhaFuncionario(Funcionario f) {
        folhaFuncionarios.add(f);
    }

    public void listarFolhas() {
        System.out.println("\nFolhas de Pagamento Salvas:");
        for(Funcionario f : folhaFuncionarios) {
            System.out.println(f);
        }
    }

}
