public class Principal {

    public static void main(String[] args) {
        
        // exemplo01();
        exemplo02();

    }

    public static void exemplo01() {
       
        Jogo j1 = new Jogo(); // construtor padrão da classe
        
        j1.setTitulo("The Last of Us");
        j1.setGenero("Ação / Aventura");
        j1.setAnoLancamento(2013);

        System.out.println("Dados do Jogo 1:");
        System.out.println(j1.toString());

        // Criar nova instância de Jogo
        // Não vamos atribuir valores aos atributos
        // Vamos mostrar os dados dessa instância
        Jogo j2 = new Jogo();
        System.out.println("\nDados do Jogo 2:");
        System.out.println(j2.toString());

        // Criar uma nova instância de Jogo utilizando o construtor parametrizado
        Jogo j3 = new Jogo ("Red Dead Redemption 2", 
                            "RPG / Aventura", 
                            2018);

        System.out.println("\nDados do Jogo 3:");
        System.out.println(j3.toString());

        Jogo j4 = new Jogo("Detroit: Become Human");
        System.out.println("\nDados do Jogo 4:");
        System.out.println(j4.toString());

    }

    public static void exemplo02() {

        FolhaPagamento folha1 = new FolhaPagamento(
            "Jason Sobreiro",
            120, 
            45.15f);

        System.out.println("Folha de Pagamento 1:");
        System.out.println(folha1.toString());

        System.out.println("Horas trabalhadas alteradas para 80h.");
        folha1.setHorasTrab(80);

        System.out.println("Folha 1 Atualizada:");
        System.out.println(folha1.toString());

        System.out.println("Valor da hora de trabalho alterado para: 200");
        folha1.setValorHora(200);

        System.out.println("Folha 1 Atualizada novamente:");
        System.out.println(folha1.toString());

     
    }

}
