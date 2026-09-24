public class Calc {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (args.length == 0) {
            System.out.println("Please provide at least one integer.");
            return;
        }
        System.out.println("Sum = " + (a + b));
        System.out.println("Substraction = " + (a - b));
        System.out.println("Division = " + (a/b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Remainder = " + (a % b));
        
    
}
}