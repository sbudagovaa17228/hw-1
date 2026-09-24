import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        double a = scanner.nextDouble();
        if(a<0){
            System.out.println("negative");
        } else if(a>0){
            System.out.println("positive");
        } else {
            System.out.println("neutral");
        }

    }
}
