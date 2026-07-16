package assignment_04;

public class q13 {
    // Write a function that returns all prime numbers between two given numbers.
    public static void main(String[] args) {
        int start = 10; // Change this value to test with different numbers
        int end = 50; // Change this value to test with different numbers
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        printPrimeNumbers(start, end);
    }
    
    public static void printPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a newline at the end
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}   
