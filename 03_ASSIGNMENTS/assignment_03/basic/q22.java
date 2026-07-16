package assignment_03.basic;

public class q22 {
    public static void main(String[] args) {
// Subtract the Product and Sum of Digits of an Integer
        int number = 234; // Change this value to test with different numbers
        int product = 1;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            sum += digit;
            number /= 10;
        }

        int result = product - sum;
        System.out.println("The difference between the product and sum of the digits is: " + result);
    }

}


