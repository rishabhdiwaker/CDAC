// Square root
import java.util.Scanner;

class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int res = 0;
        for(int i = 1 ; i <= n; i ++){
            if (i * i <= n) {
                res = i;   
            }
        }
        System.out.print("Square root of number is: " + res);
        sc.close();
    }
}
