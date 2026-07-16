package assignment_04;

public class q5 {
    // Define a method that returns the product of two numbers entered by user.
    public static void main(String[] args) {
        int num1 = 5; // Change this value to test with different numbers
        int num2 = 10; // Change this value to test with different numbers
        int product = calculateProduct(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }

    public static int calculateProduct(int a, int b) {
        return a * b;
    }
    
}
