package star.com;

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sp =(n - 1) * 2;
        int st = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= st; j ++){
                System.out.print("* ");
            }
            for (int j = 1; j <= sp; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= st; j ++){
                System.out.print("* ");
            }
            sp-=2;
            st++;
            System.out.println();
        }
    }
}
