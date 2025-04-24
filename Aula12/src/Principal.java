public class Principal {

    public static void main(String[] args) {
        
        // Exercício 01
        Animal animal = new Animal("Dogo", "Cachorro", 7);
        Tutor tutor = new Tutor("Fulano", "(41) 9874-7894", animal);

        System.out.println("Exercício 01: Mostrar dados do tutor e seu animal");
        System.out.println(tutor.toString());

        System.out.println("\n-----------------------------------\n");

        // Exercício 02
        Autor autor = new Autor("Beltrano Souza", "Brasileira");
        Livro livro = new Livro("O Grande Livro", "Qualquer", 120, autor);

        System.out.println("Exercício 02: mostrar dados do livro e seu autor:");
        System.out.println(livro.toString());

        System.out.println("\n-----------------------------------\n");
        
        // Ercício 03
        Operadora operadora = new Operadora("Morto", 41);
        Telefone telefone = new Telefone("99987-4567", "iPônei", operadora);

        System.out.println("Exercício 03: mostrar dados do telefone e sua operadora:");
        System.out.println(telefone.toString());

        System.out.println("\n-----------------------------------\n");

        Departamento departamento = new Departamento("ETI", "Ecoville / Osório");
        Professor professor = new Professor("Jason Sobreiro", 
                                            "Desenvolvimento de Software", 
                                            "jasobreiro@up.edu.br", 
                                            departamento);

        System.out.println("Ecercício 04: Mostrar dados do professor e seu departamento:");
        System.out.println(professor.toString());

        System.out.println("\n-----------------------------------\n");

        Cliente cliente = new Cliente("Cicrano", "589.654.789-89");
        ContaBancaria contaBancaria = new ContaBancaria("1234-56", 1234.56, cliente);

        System.out.println("Exercício 05: Mostrar dados da conta e cliente:");
        System.out.println(contaBancaria.toString());

    }


}
