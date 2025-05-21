
public class Pedido{
    private int codigoPedido, quantidade;
    private String nomeProduto, dataPedido;
    private double precoUnitario;

    //Construtor
    public Pedido(int codigoPedido, int quantidade, double precoUnitario, String nomeProduto, String dataPedido){
        this.codigoPedido = codigoPedido;
        this.quantidade = quantidade;
        this.nomeProduto = nomeProduto;
        this.dataPedido = dataPedido;
        this.precoUnitario = precoUnitario;
    }
    //Ou métodos set
    public void setCodigoPedido(int codigoPedido){
        this.codigoPedido = codigoPedido;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public void setDataPedido(String dataPedido){
        this.dataPedido = dataPedido;
    }

    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }
}