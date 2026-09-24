public class Fact {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int factorial= 1;
        if(n<0){
            System.out.println("Error! Enter positive integer.");
        } else{
            while(n != 0){
                factorial = factorial* n; 
                n--;
            }
            System.out.println("Factorial of given number is: " + factorial);
        }
    }
}
