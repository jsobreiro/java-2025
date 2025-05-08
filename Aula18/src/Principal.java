
public class Principal {

    public static void main(String[] args) {
        
        // exemploClasseAbstrata();
        exemploInterfaces();


    }

    public static void exemploClasseAbstrata(){

        // Não é possível instanciar um objeto de Funcioario, pois
        // esta classe é abstrata. Porém, podemos instanciar um
        // objeto de Funcionario como uma instância de Professor.
        // Isto é possível, graças a relação de herança entre elas.
        // Este é um exemplo de polimorfismo.
        Funcionario fun1 = new Professor("Fulano da Silva" , "Java");
        Funcionario fun2 = new Coordenador("Beltrano Souza", "Engenharia de Software");

        System.out.println("Dados de Funcionario 1:");
        System.out.println(fun1);
        System.out.println(fun1.apresentacao());

        System.out.println("\nDados de Funcionario 2:");
        System.out.println(fun2);
        System.out.println(fun2.apresentacao());

        // nova instancia de Cadastro
        Cadastro cadastro = new Cadastro();

        cadastro.cadastrar(fun1);
        cadastro.cadastrar(fun2);
        cadastro.cadastrar(new Professor("Cicrano Oliveira", "PHP"));
        cadastro.cadastrar(new Coordenador("Deltrano Pereira", "Sistemas de Informação"));

        cadastro.listarTodos();
        
    }

    public static void exemploInterfaces() {

        // Criando formas geométricas usando polimorfismo
        FormaGeometrica f1 = new Circulo(3);
        FormaGeometrica f2 = new Retangulo(4, 5);
        FormaGeometrica f3 = new Triangulo(6, 2);
        FormaGeometrica f4 = new Quadrado(6.5);
        
        /* Criando formas geométricas SEM polimorfismo
        Circulo c1 = new Circulo(3);
        Retangulo r1 = new Retangulo(4, 5);
        Triangulo t1 = new Triangulo(6, 2);
        Quadrado q1 = new Quadrado(6.5);*/

        System.out.println("Cálculo das áreas das formas geométricas:");
        System.out.println("Área do Círculo: " + f1.calcularArea());
        System.out.println("Área do Retângulo: " + f2.calcularArea());
        System.out.println("Área do Triângulo: " + f3.calcularArea());
        System.out.println("Área do Quadrado: " + f4.calcularArea());

        /////////////////////////////////////
        
        // Criando instâncias de Animal com polimorfismo
        Animal a1 = new Cachorro("Mimo", "Lhasa Apso");
        Animal a2 = new Gato ("Meg", "Amarelo");

        // Criar instância de Carro
        Carro c1 = new Carro("Ford Ka", "ABC-1234");

        System.out.println("\nSom dos animais:");
        System.out.println(a1.fazerSom());
        System.out.println(a2.fazerSom());
        
        System.out.println("\nSom do carro:");
        System.out.println(c1.fazerSom());
        
        
    
 

    }

}
