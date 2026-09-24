import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            sum += x;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("average: " + average);
        } else {
            System.out.println("no numbers entered");
        }
    }
}