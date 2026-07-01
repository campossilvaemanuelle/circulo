public class Principal {

    public static void main(String[] args) {

        // Objeto da classe Circulo
        Ponto p1 = new Ponto(5, 8);
        Circulo c1 = new Circulo(p1, 10);

        System.out.println("=== CÍRCULO ===");
        c1.exibirDados();

        System.out.println();

        // Objeto da classe CirculoColorido
        Ponto p2 = new Ponto(15, 20);
        CirculoColorido cc1 = new CirculoColorido(
                p2,
                7,
                "Preto",
                "Azul"
        );

        System.out.println("=== CÍRCULO COLORIDO ===");
        cc1.exibirDados();

        System.out.println();

        // Alterando atributos
        cc1.setCorTracado("Vermelho");
        cc1.setCorPreenchimento("Amarelo");
        cc1.setRaio(12);

        System.out.println("=== APÓS ALTERAÇÕES ===");
        cc1.exibirDados();
    }
}
