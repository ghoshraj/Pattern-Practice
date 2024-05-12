package star.com;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        /*
        question---
         *
       * *
     * * *
   * * * *
 * * * * *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sp = n - 1;
        int st = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <=sp; j++){
                System.out.print("  ");
            }
//           for (int j = 1; j <= i; j++){
//               System.out.print("*" + " ");
//           }
            for (int j = 1; j <= st; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
           sp--;
           st++;
        }
    }
}
