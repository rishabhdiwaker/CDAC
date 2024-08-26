import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("(+, -, *, /)Choose the operator: ");
        char op = sc.next().charAt(0);
        int result=0;
        if(op == '+'){
            result = a+b;
        }
        else if(op == '-'){
            result = a-b;
        }
        else if(op == '*'){
            result = a*b;
        }
        else if(op == '/'){
            if(b == 0){
                result = 0;
            }else
            {
                result = a/b;
            }
        }
        System.out.println(result);
    }
}