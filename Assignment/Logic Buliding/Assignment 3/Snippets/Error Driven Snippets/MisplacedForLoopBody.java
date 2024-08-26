public class MisplacedForLoopBody {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
        System.out.println(i);
        System.out.println("Done");
    }
} 
// Done is printed only once because in for loop we have not used curly braces so it is working for only next single line