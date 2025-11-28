import java.util.LinkedList;
import java.util.Queue;

public class Rapargia {

    public static void main(String[] args) {

        Queue<String> veiculos = new LinkedList<>();

        veiculos.add("Gol");
        veiculos.add("Corsa");
        veiculos.add("Jetta");

        // Lista o primeiro item da fila
        String PrimeiroVeiculo = veiculos.peek();

        System.out.println("Primeiro veiculo: " + PrimeiroVeiculo);

        // Remove o primeiro item da fila
        String RemoverVeiculo = veiculos.poll();

        System.out.println("Veiculo removido: " + RemoverVeiculo);

        // Tamanho da fila
        int TamanhoFila = veiculos.size();
        System.out.println("A fila tem o tamanho de: " + TamanhoFila);

        // Se esta vazio
        boolean FilaVazia = veiculos.isEmpty();
        System.out.println("A fila esta vazia? " + FilaVazia);

        // Listar todos
        for (String carro : veiculos) {
            System.out.println(carro);
        }

    }
}