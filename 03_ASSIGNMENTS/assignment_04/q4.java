package assignment_04;

public class q4 {
    // Write a program to print the sum of two numbers entered by user by defining your own method.
    public static void main(String[] args) {
        int num1 = 5; // Change this value to test with different numbers
        int num2 = 10; // Change this value to test with different numbers
        int sum = calculateSum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
    
    public static int calculateSum(int a, int b) {
        return a + b;
    }
}
