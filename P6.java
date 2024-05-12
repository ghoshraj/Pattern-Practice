package star.com;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
 /*       question --
        1 2 3 4 5
        10 9 8 7 6
        11 12 13 14 15
        20 19 18 17 16
        21 22 23 24 25
  */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            int x = ((i - 1) * n) + 1;
            if (i % 2 != 0) {

                for (int j = 1; j <= n; j++) {
                    System.out.print(x + " ");
                    x++;
                }
            }
            else {
                int b = n * i;
                for (int j = 1; j <= n; j++){
                    System.out.print(b + " ");
                    b--;
                }
            }
            System.out.println();
        }

    }
}