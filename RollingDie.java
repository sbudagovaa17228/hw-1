public class RollingDie {
    public static void main(String[] args) {
        double randomValue = Math.random(); 
        int result;

        if (randomValue < 0.125) {
            result = 1;
        } else if (randomValue < 0.25) {
            result = 2;
        } else if (randomValue < 0.375) {
            result = 3;
        } else if (randomValue < 0.5) {
            result = 4;
        } else if (randomValue < 0.75) {
            result = 5;
        } else {
            result = 6;
        }

        System.out.println("The die shows: " + result);
    }
}
