public class IncorrectWhileCondition {
	public static void main(String[] args) {
		int count = 5;
		while (count > 0) {
			System.out.println(count);
			count--;
		}
	}
} 

//error - no run will occur but it will not print anything. To print count we have to change the condition.