public class Main {

    public static void main(String[] args) {
        int a = 5;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= a - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
