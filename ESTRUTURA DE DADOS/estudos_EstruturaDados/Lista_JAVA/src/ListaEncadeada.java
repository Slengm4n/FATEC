import java.nio.channels.Pipe.SourceChannel;
import java.util.LinkedList;

public class ListaEncadeada {
    public static void main(String[] args) {

        LinkedList<String> veiculos = new LinkedList<>();

        // Adicionando elementos na lista
        veiculos.add("Gol");
        veiculos.add("Civic");

        // Adicionando elementos no fim da lista
        veiculos.addLast("HB20");
        veiculos.addLast("Corola");

        // Adicionando elementos no inicio da lista
        veiculos.addFirst("Palio");
        veiculos.addFirst("Uno");

        // Remover um elemento da lista
        veiculos.remove("Corola");

        // Remover o ultimo elemento da lista
        veiculos.removeLast();

        // Remover o primeiro elemento da lista
        veiculos.removeFirst();

        System.out.println(veiculos.get(2));

        int tamanhoListaVeiculos = veiculos.size();

        System.out.println("Tamanho da lista: " + tamanhoListaVeiculos);

        boolean isEmpty = veiculos.isEmpty();

        System.out.println("A lista esta vazia? " + isEmpty);

        veiculos.clear();
    }
}
