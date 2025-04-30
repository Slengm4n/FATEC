
public class pedido {

    public static void main(String[] args) {
        pedidos pedido = new pedidos(0, null, 0, 0, null);
        pedido.setCodigoPedido(2024);
        pedido.setNomeProduto("Notebook Dell");
        pedido.setQuantidade(2);
        pedido.setPrecoUnitario(3599.90);
        pedido.setDataPedido("2025-05-02");

    }
}