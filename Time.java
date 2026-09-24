import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("enter seconds: ");
        int seconds = scanner.nextInt(); 
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        seconds = (seconds%3600)%60;
        System.out.println("" + hours + "h " + minutes +"m " + seconds +"s");


        
    }
}
