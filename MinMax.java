import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min =0;
        double max=0;
        boolean isFirstNumber = true;
        while(scanner.hasNextDouble()){
            double num = scanner.nextDouble();
            if (isFirstNumber) {
                min = num;
                max = num;
                isFirstNumber = false;
            } else {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }

        }
    }
    System.out.println("Max: " +max);
    System.out.println("Min: "+ min);
}}
