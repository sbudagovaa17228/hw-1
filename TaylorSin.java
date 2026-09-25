
import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x:");
        double x = scanner.nextDouble();
        System.out.println("enter number of terms:");
        int n= scanner.nextInt();

        double sum = 0;

        //firstly exponent on the x's head
       for(int i=0; i<n; i++){
        int exponent = 2*i +1;
       
       // power of x
       double power = 1;
       for(int j=0; j<exponent; j++){
         power = power * x;
       }
       //factorial, because 0 and 1 is already 1
       long factorial =1;
       for(int k =2; k<exponent; k++){
        factorial = factorial * k;
       }
       //alternating sign 
       double sign = 1;
       if(i%2 ==0){
        sign = 1;
       } else {
        sign = -1;
       }
       double term = sign * power/factorial;
       sum = sum + term;
    }
    System.out.println("My taylor sin: " + sum);
    System.out.println("Math.sin(x): " + Math.sin(x));
    }
}
