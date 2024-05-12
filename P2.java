package star.com;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        /* question ---
         *****
         *   *
         *   *
         *   *
         *****
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            if (i == 1 || i == n) {
//                for (int j = 1; j <= n; j++) {
//                    System.out.print("*");
//                }
//            }
//            else {
//                System.out.print("*");
//                for (int j = 1; j <= n-2; j++){
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
