public class WrongInitializationForLoop{
	public static void main(String[] args){
		for (int i = 10; i >= 0; i++) {
			System.out.println(i);
		}
	}
} 

//here loop will go infinite times. so to stop we have to update the increment to decrement