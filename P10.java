package star.com;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        /*
        question --
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sp = n - 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= sp; j++){
                System.out.print("  ");
            }
             for (int j = 1; j <= i; j++){
             System.out.print(j + " ");
           }
           for (int j = i-1; j >0; j--){
               System.out.print(j + " ");
           }
            System.out.println();
            sp--;
        }
    }
}

