import java.util.Scanner;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1; // -1 - 1

            while (x * x + y * y > 1) {
                x = Math.random() * 2 - 1;
                y = Math.random() * 2 - 1;
            } //if true generates a new one so it doesnt leave the range we have setted

            System.out.println("(" + x + ", " + y + ")");
        }
    }
}