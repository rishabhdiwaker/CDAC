public class OffByOneDoWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } 
        while (num < 6);
    }
}

// by changing condition we can run tihe loop from 1 to 5