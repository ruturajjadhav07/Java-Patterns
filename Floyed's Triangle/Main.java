public class Main {

    public static void main(String[] args) {
        int a = 5;
        int num = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;           // Increment by 1
            }
            System.out.println();
        }
    }
}
