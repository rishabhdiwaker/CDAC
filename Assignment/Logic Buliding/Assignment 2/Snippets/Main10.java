/*
-------Incorrect Program------

public class Main10{
	public void display(){
		System.out.println("No parameters");
	}
	
	public void display(int num){
		System.out.println("With parameter: " + num);
	}
	
	public static void main(String[] args){
		display();
		display(5);
	}
}

*/

//error - will get compilation error 
//- non static method can not be referenced from a static method

//how can we rectify error?
// use static before display()
//and second part of the question - yes method overloading is allowed.

//Correct program
public class Main10{
	public static void display(){
		System.out.println("No parameters");
	}
	
	public static void display(int num){
		System.out.println("With parameter: " + num);
	}
	
	public static void main(String[] args){
		display();
		display(5);
	}
}