public class Main {
    public static void main(String[] args) {
        int b = 10;

        for (int i = 100; i < 1000; i++) {
            if (i%5 == 0 && i%6 == 0) {
            System.out.print(i + " ");

            b++;
            if (b % 10 == 0) {

            System.out.println();
                }
            }
        }
    }
}
