import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        double n = scanner.nextDouble();
        double harmonic = 0;
        while (n>0){
            harmonic += 1/n;
            --n;
        }
        System.out.println("n-th harmonic is: " + harmonic);
    }
}
