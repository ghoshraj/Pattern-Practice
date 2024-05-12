package star.com;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        /*
        question --
     x
    x  x
   x  x  x
  x  x  x  x
 x  x  x  x  x
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int space = n - 1;
        int star = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= space; j ++){
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++){
                System.out.print("x ");
            }
            System.out.println();
            space--;
            star++;
        }
    }
}
