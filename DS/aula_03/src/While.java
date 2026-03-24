public class While {
    public static void main(String[] args) throws Exception {

        int i = 0;

        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println("Par :" + i);
            }
            i++;
        }
    }
}
