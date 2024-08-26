public class Main5{
	public static void main(String[] args){
		System.out.println("Main method with String[] args");
	}
	
	public static void main(int[] args){
		System.out.println("Overloaded main method with int[] args");
	}	
}

//Result- program compile and run successfully
//output - "Main method with String[] args
// I have observed that a program can not have more than one "main" method.
// I also found that if i remove first main method it will not run.