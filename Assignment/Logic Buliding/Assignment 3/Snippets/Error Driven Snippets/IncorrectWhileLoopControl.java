public class IncorrectWhileLoopControl {
    public static void main(String[] args) {
        int num = 10;
        while (num == 10) {
            System.out.println(num);
            num--;
        }
    }
}

//for checking the condition use "==" insted of "="