package star.com;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= st; j++){
                System.out.print("*");
            }
            if (i <= n /2){
                st++;
            }
            else {
                st--;
            }
            System.out.println();
        }
    }
}
