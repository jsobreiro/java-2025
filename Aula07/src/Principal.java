public class Principal {

    public static void main(String[] args) {
        
        //pooPessoa();
        pooCarro();

    }

    public static void pooPessoa() {

        // Criar objeto da classe Pessoa
        // Ou melhor dizendo: instanciar uma Pessoa
        // instância = objeto da classe

        Pessoa p1 = new Pessoa();

        // Guardar dados dentro dos atributos de p1:
        p1.nome = "Jason Sobreiro";
        p1.idade = 38;
        p1.email = "jasobreiro@up.edu.br";

        System.out.println("Dados da Pessoa p1:");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("E-mail: " + p1.email);

        // nova instância de Pessoa
        Pessoa p2 = new Pessoa();

        p2.nome = "Cecília";
        p2.idade = p1.idade; // copiar a idade de p1 para a idade de p2
        p2.email = "cecilia@gmail.com" ;

        System.out.println("\nDados da Pessoa p2:");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Idade: " + p2.idade);
        System.out.println("E-mail: " + p2.email);

        // p3
        Pessoa p3 = p2; // "clonado" o objeto (na verdade, ambos são o MESMO objeto)

        // mostrar o nome de p2:
        System.out.println("\nNome de p2: " + p2.nome);
        // mostrar nome de p3:
        System.out.println("Nome de p3: " + p3.nome);

        // alterar o nome de p3:
        p3.nome = "Manuela";

        // mostrar novamente nome de p3:
        System.out.println("Nome de p3 após a alteração: " + p3.nome);

        // mostrar também nome de p2:
        System.out.println("Nome de p2 após alterar o nome de p3: " + p2.nome);


        System.out.println("\n--------------------------\n");

        // executar ações de Pessoa para p1 e p2

        System.out.println("\nAndar:");
        p1.andar();
        p2.andar();

        System.out.println("\nFalar:");
        p1.falar();
        p2.falar();

    }

    public static void pooCarro() {

        // Criar uma instancia de Carro
        Carro c1 = new Carro();

        // c1.modelo = "Nissan Versa";
        /*
         * Como na classe Carro os atributos são Privados, não
         * conseguimos mais acessá-los diretamente, como na linha acima.
         * Agora, para guardar ou recuperar o valor de cada atributo,
         * devemos chamar o método set e get correspondente
         */

        // Atribuindo valores aos atributos do Carro c1:
        c1.setModelo("Ford Ka"); // c1.modelo = "Ford Ka"
        c1.setPlaca("ABC-1B34");
        c1.setCor("Vermelho");

        // Mostrar dados do Carro c1:
        System.out.println("\nDados do Carro c1:");
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Placa: " + c1.getPlaca());
        System.out.println("Cor: " + c1.getCor());

        System.out.println(); // linha em branco

        c1.acelerar(); // ação de "acelerar" do Carro c1
        c1.parar(); // ação de "parar" do Carro c1
    
        // Nova instância de Carro
        Carro c2 = new Carro();

        c2.setModelo("Mitsubishi Lancer");
        c2.setPlaca("ABC-7A29");
        c2.setCor("Prata");

        System.out.println("\nDados do Carro c2:");
        System.out.println(c2.toString());

        // Carro c3
        Carro c3 = new Carro();
        c3.setModelo(c1.getModelo());
        // Acima, estamos trazendo o modelo de c1 e guardando o valor retornado
        // dentro do atributo "modelo" do carro c3

        c3.setPlaca("ASQ-2345");
        c3.setCor("Preto");

        System.out.println("\nDados do Carro c3:");
        System.out.println(c3.toString());

    }

}
