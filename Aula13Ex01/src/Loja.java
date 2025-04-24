
import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Produto> listaProdutos;

    public Loja () {
        listaProdutos = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void listarProdutos() {
        
        System.out.println("\nProdutos Cadastrados:");
        
        for (Produto tempProduto : listaProdutos) {
            System.out.println(tempProduto + "\n");
        }
    }


}
