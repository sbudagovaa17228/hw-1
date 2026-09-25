import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int anynumber= scanner.nextInt();
        double sum = 0;
        double product =1;
        int count =0;
        while(anynumber>0){
            sum = sum + (anynumber%10);
            product = product * (anynumber%10);
            anynumber = anynumber/10;
            count++;
        }
        double average = sum/count;
        System.out.println("Sum:" +sum);
        System.out.println("Product: "+product);
        System.out.println("Average: "+average);
    }
}
