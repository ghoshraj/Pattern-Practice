package star.com;

import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = (n/2) + 1;
        int sp = 0;
        for (int i = 1; i<= n; i++){
            for (int j = 1; j <= st;j++){
                if (i == 1 || i == n || j == 1)
                    System.out.print("*"+" ");
            }
            for (int j = 1; j <= sp; j++){
                System.out.print(" ");
            }
            if (i <= n/2){
                st-=2;
                sp++;
            }
            else {
                sp--;
                st+=2;
            }
            System.out.println();
        }
    }
}
