import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0] = 5;
        myArray[1] = 10;
        myArray[2] = 15;
        myArray[3] = 11;
        myArray[4] = 6;
        myArray[5] = 9;
        myArray[6] = 3;
        myArray[7] = 8;
        myArray[8] = 2;
        myArray[9] = 4;

        // Percorrer todos elementos do array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Array elements:" + myArray[i]);
        }

        // Tamanho do array
        int myArrayLength = myArray.length;
        System.out.println("Array Length:" + myArrayLength);
        System.out.println("Arrau String elements:" + Arrays.toString(myArray));

        // Copia de um array
        int[] copyArray = myArray.clone();
        System.out.println("Array Copia:" + Arrays.toString(copyArray));

        // Copia uma parte delimitada do Array
        int[] anotherCopyArray = Arrays.copyOf(myArray, 3);
        System.out.println(Arrays.toString(anotherCopyArray));

        // Ordenação de um array
        int[] newArray = { 6, 4, 1, 8, 3, 5, 9, 0, 1, 7, 2, 10 };
        Arrays.sort(newArray);
        System.out.println("Array Ordenado:" + Arrays.toString(newArray));

        // Preenchimento de um array com um valor específico
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Array preenchido:" + Arrays.toString(filledArray));

        // Comparação de arrays com o mesmo tamanho, sendo true quando forem iguais
        int[] arrayOne = { 1, 2, 3, 4, 5 };
        int[] arrayTwo = { 1, 2, 3, 4, 5 };
        boolean areEqual = Arrays.equals(arrayOne, arrayTwo);
        System.out.println("Arrays are equal: " + areEqual);

        // BinarySearch com array, para saber exatamente em qual posição está o dado etc
        int[] arrayBinarySearch = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int index = Arrays.binarySearch(arrayBinarySearch, 14);
        System.out.println("Index of 14: " + index);
    }
}
