
public class pedidos {

    private int codigoPedido;
    private String nomeProduto;
    private int quantidade;
    private double precoUnitario;
    private String dataPedido;

    public pedidos(int codigoPedido, String nomeProduto, int quantidade, double precoUnitario, String dataPedido) {
        this.codigoPedido = codigoPedido;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.dataPedido = dataPedido;
    }

    public void setCodigoPedido(int codigoPedido){
        this.codigoPedido = codigoPedido;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }

    public void setDataPedido(String dataPedido){
        this.dataPedido = dataPedido;
    }

    public int getCodigoPedido(){
        return this.codigoPedido;
    }

    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double getPrecoUnitario(){
        return this.precoUnitario;
    }

    public String getDataPedido(){
        return this.dataPedido;
    }

}
