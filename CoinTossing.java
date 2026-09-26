import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of tosses:");
        int n = scanner.nextInt();

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < n; i++) {
            double randomValue = Math.random(); 

            if (randomValue < 0.5) {
                headsCount = headsCount + 1; 
            } else {
                tailsCount = tailsCount + 1;
            }
        }

        double headsProbability = headsCount / (double) n;
        double tailsProbability = tailsCount / (double) n;

        System.out.println("Heads count: " + headsCount);
        System.out.println("Tails count: " + tailsCount);
        System.out.println("Probability of heads: " + headsProbability);
        System.out.println("Probability of tails: " + tailsProbability);
    }
}