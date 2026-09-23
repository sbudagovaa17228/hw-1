import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("enter first number:");
    int a = scanner.nextInt();
    System.out.println("enter second number:");
    int b = scanner.nextInt();
    int sum = a+b;
    System.out.println("sum is " + sum);

}
}