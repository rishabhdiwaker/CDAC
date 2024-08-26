import java.util.*;

public class Nested_Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        switch(w){
            case 1:
                System.out.println("Monday and It is a weekday");
                break;
            case 2:
                System.out.println("Tuesday and It is a weekday");
                break;
            case 3:
                System.out.println("Wednesday and It is a weekday");
                break;
            case 4:
                System.out.println("Thursday and It is a weekday");
                break;
            case 5:
                System.out.println("Friday and It is a weekday");
                break;
            case 6:
                System.out.println("Saturday and It is a weekend");
                break;
            case 7:
                System.out.println("Sunday and It is a weekend");
                break;
            default:
                System.out.println("No weekday and Weekend");

        }
    }
}
