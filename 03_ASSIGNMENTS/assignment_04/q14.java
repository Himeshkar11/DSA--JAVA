package assignment_04;

public class q14 {
    // Write a function that returns the sum of first n natural numbers.
    public static void main(String[] args) {
        int n = 10; // Change this value to test with different numbers
        int sum = sumOfNaturalNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
    
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
