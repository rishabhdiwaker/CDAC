// Prime number
import java.util.Scanner;

class Ques2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		if(n <= 1 ){
			System.out.println("false");
		}
		int factcount = 0;
		for(int i = 2 ; i < n; i++){
			if( n % i == 0){
				factcount++;
			}
		}
		
		if(factcount <= 1){
			System.out.println("true");
		}		
		else{
			System.out.println("false");
		}
		sc.close();
	}
}