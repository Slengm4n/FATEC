public class carro extends veiculo {
    private int nPortas;

    public carro(String marca, String modelo, int ano, int nPortas) {
        super(marca, modelo, ano);
        this.nPortas = nPortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + nPortas);
    }
}
