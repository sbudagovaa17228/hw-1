import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n;j++){
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }

            }
            System.err.println("");

        }

    }
}
