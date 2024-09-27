// Fibonacci using loop
import java.util.Scanner;

class Ques4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.print(n1 + ", " + n2);
        for(int i = 2; i < n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(", "+ n3);
        }
        sc.close();
    }
}
