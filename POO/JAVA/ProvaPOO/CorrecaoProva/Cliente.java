public class Cliente {
    private int idCliente;
    private String nome, sexo, dataNascimento;
    private double rendaBruta;

    public Cliente( int idCliente, String nome, String sexo, String dataNascimento, double rendaBruta){
        this.idCliente = idCliente;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.rendaBruta = rendaBruta;
    }
}
