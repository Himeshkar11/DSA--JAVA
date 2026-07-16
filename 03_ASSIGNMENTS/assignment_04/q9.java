package assignment_04;

public class q9 {
    // Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
    // 5! = 1 * 2 * 3 * 4 * 5 = 120
    public static void main(String[] args) {
        int number = 5; // Change this value to test with different numbers
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
    
    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
}
