public class Main24{
	public static void main(String[] args) {
	int level = 1;
		switch(level) {
			case 1:
				System.out.println("Level 1");
			case 2:
				System.out.println("Level 2");
			case 3:
				System.out.println("Level 3");
			default:
				System.out.println("Unknown level");
		}
	}
}

//it will print all cases because case 1 is true and we haven't use break statement so it will print all cases.