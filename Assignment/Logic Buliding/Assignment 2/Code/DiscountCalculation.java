import java.util.*;

class DiscountCalculation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int discount = 0;
        System.out.println("Do you a membership card(1/0): ");
        int m = sc.nextInt();
        if(n>=1000){
            if(m == 1)
                discount = (n*25)/100;
            else{
                discount = (n*20)/100;
            }
        }
        else if(n>=500 && n <= 999){
            if(m ==1)
                discount = (n*15)/100;
            else{
                discount = (n*10)/100;
            }
        }
        else if(n< 500){
            if(m ==1){
                discount = (n*10)/100;
            }
            else{
                discount = (n*5)/100;
            }
        }
        System.out.println(discount);
    }
}