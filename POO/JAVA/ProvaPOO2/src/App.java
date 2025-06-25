public class App{
    public static void main(String[] args) {

        carro carro = new carro("Fiat", "Uno", 2000, 4);
        moto moto = new moto("Honda", "CG 160", 2020, 160);

        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();

        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
    }
}
