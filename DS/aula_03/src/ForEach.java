public class ForEach {

    public static void main(String[] args) {

        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println("Par:" + num);
            }
        }
    }
}