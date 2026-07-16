package assignment_03.intermediate;

public class q16 {
    // Find if a number is palindrome or not
    public static void main(String[] args) {
        int number = 121; // Change this value to check for a different number
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
        if (originalNumber == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
