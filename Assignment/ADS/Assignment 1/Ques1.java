//Armstrong Number
import java.util.Scanner;

class Ques1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(n != 0){
			int digit = n%10;
			sum = sum + (digit*digit*digit);
			n = n /10;	
		}
		if(sum == temp){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		sc.close();
	}
}