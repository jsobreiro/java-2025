import java.util.ArrayList;
import java.util.List;

public class GerenciadorImpressos {

    private List<Impresso> listaImpressos;

    public GerenciadorImpressos() {
        listaImpressos = new ArrayList<>();
    }

    public void salvarImpresso(Impresso i){
        listaImpressos.add(i);
        System.out.println("Item cadastrado com sucesso!");
    }

    public void listarTodos() {

        System.out.println("\nImpressos Cadastrados");
        for (Impresso tempImpresso : listaImpressos) {
            System.out.println(tempImpresso);
        }

    }

    public void listarLivros() {

        System.out.println("\nLivros Cadastrados");

        for (Impresso tempImpresso : listaImpressos) {
            if (tempImpresso instanceof  Livro) {
                System.out.println(tempImpresso);
            }
        }

    }

    public void listarRevistas() {

        System.out.println("\nRevistas Cadastradas");

        for (Impresso tempImpresso : listaImpressos) {
            if (tempImpresso instanceof  Revista) {
                System.out.println(tempImpresso);
            }
        }

    }

    public boolean naoHaCadastros() {
        return listaImpressos.isEmpty();
    }

    public boolean naoHaLivros() {

        for (Impresso tempImpresso : listaImpressos) {
            if (tempImpresso instanceof Livro) {
                return false;
            }
        }

        return true;

    }

    public boolean naoHaRevistas() {

        for (Impresso tempImpresso : listaImpressos) {
            if (tempImpresso instanceof Revista) {
                return false;
            }
        }

        return true;

    }


}
