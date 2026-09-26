import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int narcissistic= scanner.nextInt();
        int sum =0;
        int replacement = narcissistic;
        while(replacement>0){
            sum = sum + ((replacement%10)*(replacement%10)*(replacement%10));
            replacement= replacement/10;
        }
        if(narcissistic == sum){
            System.out.println("The number is armstrong number");
        } else {
            System.out.println("The number is not armstrong number");
        }
    }
}
