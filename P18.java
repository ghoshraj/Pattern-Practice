package star.com;

public class P18 {
    public static void main(String[] args) {
        int n = 5;
        int sp = n /2;
        int st = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= sp; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <=st; j++){
                System.out.print("* ");
            }
            if (i <= n/2){
                sp--;
                st++;
            }
            else {
                sp++;
                st--;
            }
            System.out.println();
        }
    }
}
