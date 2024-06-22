public class Main {

    public static void main(String[] args) {

      // First Code
        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



      // Second Code
        int b = 5;

        for (int i = b; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= b - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
