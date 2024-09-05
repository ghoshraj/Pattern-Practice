package star.com;

public class p23 {
    public static void main(String[] args) {
        int n = 5;
        int sp = n - 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            System.out.print("1");
            for (int j = 1; j < (i * 2 - 1); j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("1");
            }
            System.out.println();
            sp--;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(i);
        }
        System.out.println();
    }
}