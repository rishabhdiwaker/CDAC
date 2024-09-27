// GCD
import java.util.Scanner;
class Ques5{

    static int gcd(int a, int b){
        if(a == 0) return b;
        else if(b == 0) return a;
        else if(a > b){
            return gcd(a%b, b);
        } 
        else{
            return gcd(a, b%a);
        }    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = gcd(a, b);
        System.out.println("GCD is : " + res);    
        sc.close();
    }
    
}
