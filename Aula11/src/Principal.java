public class Principal {

    public static void main(String[] args) {
        
        // criar um carro 'cr1' com construtor parametrizado
        Carro cr1 = new Carro("Ford Ka", "ABC-1234", "Vermelho");
        // criar um cliente 'cl1' com construtor parametrizado, informando o 'cr1' como
        // o valor para o atributo 'carro'
        Cliente cl1 = new Cliente("Fulano da Silva", "(41) 99999-8888", cr1);

        // criar carro 'cr2' com construtor padrão
        Carro cr2 = new Carro();

        // setar valores para 'cr2':
        cr2.setModelo("Nissan Versa");
        cr2.setPlaca("VER-5432");
        cr2.setCor("Preto");

        // criar cliente 'cl2' com construtor padrão
        Cliente cl2 = new Cliente();

        // setar valores para 'cl2':
        cl2.setNome("Beltrano Souza");
        cl2.setTelefone("(41) 3456-7890");
        cl2.setCarro(cr2); // carro 'cr2' sendo setado como parâmetro para o carro de 'cl2'

        // criar cliente 'cl3' utilizando contrutor parametrizado (incluindo para o carro)
        Cliente cl3 = new Cliente (
            "Cicrano Oliveira", 
            "(41) 98786-5678",
            new Carro("Chevrolet Celta", "ASQ-3456", "Prata") );
            
    
        // Mostrar dados do carro 'cr1'
        System.out.println("\nCarro cr1: " + cr1.toString());
        // Mostrar dados do carro 'cr2'
        System.out.println("\nCarro cr2: " + cr2.toString());

        System.out.println("\n-----------------------------\n");

        // Mostrar dados do cliente 'cl1'
        System.out.println("\nCliente cl1:\n" + cl1.toString());

        // Mostrar dados do cliente 'cl2'
        System.out.println("\nCliente cl2:\n" + cl2.toString());

        // Mostrar dados do cliente 'cl3'
        System.out.println("\nCliente cl3:\n" + cl3.toString());

        System.out.println("\n-----------------------------\n");

        // Criar carro 'cr3' com os dados do carro do cliente 'cl3'
        Carro cr3 = cl3.getCarro();

        // Alterar cor do 'cr3'
        cr3.setCor("Branco");
        
        // mostrar dados do carro 'cr3'
        System.out.println("\nCarro cr3: " + cr3.toString());
        
        // mostrar dados do 'cl3'
        System.out.println("\nCliente cl3:\n" + cl3.toString());

        System.out.println("\n-----------------------------\n");

        // Mostrar modelo do carro do cliente 'cl1'
        System.out.println("\nModelo do carro do cliente 1: " + cl1.getCarro().getModelo());

        // alterar cor do carro do cliente 2 e mostrar nova cor na tela
        cl2.getCarro().setCor("Azul");
        System.out.println("\nNova cor do carro do cliente 2: " + cl2.getCarro().getCor());

        // criar carro 'cr4'
        Carro cr4 = new Carro("Ford Fiesta", "POR-7890", "Vermelho");

        // setar novo carro para o cliente 2
        cl2.setCarro(cr4);

        // mostrar dados do cliente 2 na tela
        System.out.println("\nCliente 2 com seu novo carro:\n" + cl2.toString());


    }

}
