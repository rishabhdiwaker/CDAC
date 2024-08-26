public class DoWhileIncorrectCondition{
	public static void main(String[] args){
		int num = 0;
		do{
			System.out.println(num);
			//num++;
		}  
		while(num > 0);
	}
} 

// it will go for infinite times. so to print once we;ll remove condition.