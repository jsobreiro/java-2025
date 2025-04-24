public class Principal {

    public static void main(String[] args) {
        
        Loja loja = new Loja();

        loja.addProduto(new Produto("Camiseta preta", 29.99f, 1));
        loja.addProduto(new Produto("Calça Jeans", 299.99f, 2));
        loja.addProduto(new Produto("Jaqueta de Couro", 599.99f, 3));

        loja.listarProdutos();


    }


}
