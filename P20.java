package star.com;

import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
        int st = (n / 2)+1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= st; j ++){
                System.out.print("*");
            }
            for (int j = 1; j <= sp; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j ++){
                System.out.print("*");
            }
            if (i <= n/2) {
                st--;
                sp+=2;
            }
            else {
                st++;
                sp-=2;
            }
            System.out.println();
        }
    }
}
