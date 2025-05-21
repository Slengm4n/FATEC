public class AppCasa {
    public static void main(String[] args) {

    //Composição
    Casa casa = new Casa();
    
    Comodo quarto = new Comodo("Quarto",9);
    Comodo cozinha = new Comodo("Cozinha", 10);

    casa.adicionarComodo(cozinha);
    casa.adicionarComodo(quarto);

    casa.exibirComodo();
    }
}
