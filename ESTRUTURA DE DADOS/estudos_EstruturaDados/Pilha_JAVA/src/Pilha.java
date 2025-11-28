import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {

        // Criar pilha
        Stack<String> pilha_pratos = new Stack<>();

        // Adicionar itens a pilha
        pilha_pratos.push("Prato1");
        pilha_pratos.push("Prato2");
        pilha_pratos.push("Prato3");
        pilha_pratos.push("Prato5");
        pilha_pratos.push("Prato6");
        pilha_pratos.push("Prato7");

        // Remover o ultimo item da pilha
        String rem = pilha_pratos.pop();
        System.out.println("O elemento removido foi: " + rem);

        // Vizualisar o ultimo item na pilha
        String topo = pilha_pratos.peek();
        System.out.println("O elemento no top da lista e: " + topo);

        // Verifica se a pilha esta vazia
        Boolean isEmpty = pilha_pratos.isEmpty();
        System.out.println("A pilha esta vazia? " + isEmpty);

        // Verifica o tamanho da lista - indice 0
        int size = pilha_pratos.size();
        System.out.println("O tamho da pilha e: " + size);

        // Lista os elementos do top até a base
        System.out.println("Os elementos da pilha do topo até a base):");
        for (int i = pilha_pratos.size() - 1; i >= 0; i--) {
            System.out.println(pilha_pratos.get(i));
        }
    }
}