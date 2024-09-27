// Factorial 
import java.util.Scanner;

class Ques3{

    public static int fact(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println( "Factorial of "+ n + " is " + res);
        sc.close();
    }
}