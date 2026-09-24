import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("enter first integer: ");
        int a = scanner.nextInt();
        System.out.println("enter second integer: ");
        int b = scanner.nextInt(); 
        int sum = 0; 
        if (a > b){
            while( a != b ){
                if(a%2!=0){
                    sum = sum + a;
                
                }
                a--;

            }
            System.out.println("sum of odd: " + sum);
        } else if( b>a){
            while(b !=a){
                if(b%2 != 0){
                    sum = sum +b;
                
                }
                b--;
            }
            System.out.println("sum of odd: " + sum);
        } else if( a==b){
            if(a%2!=0){
                sum = a;
                System.out.println("sum of odd: " + sum);
            }

        }
    }
}
