import java.net.Socket;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<String> Frutas = new ArrayList<>();

        // Adiconar frutas
        Frutas.add("Maca");
        Frutas.add("Banana");
        Frutas.add("Melao");
        Frutas.add("Abacaxi");

        // Listar as frutas com base no index
        System.out.println(Frutas.get(0));

        // Remover a fruta de index 2
        String remove = Frutas.remove(2);

        // Listar a fruta removida
        System.out.println("Fruta removida: " + remove);

        // Tamanho da lista
        int size = Frutas.size();
        System.out.println("Tamanho da lista: " + size);

        // Verificar se a lista esta vazia
        boolean isEmpty = Frutas.isEmpty();
        System.out.println(isEmpty);
    }
}
