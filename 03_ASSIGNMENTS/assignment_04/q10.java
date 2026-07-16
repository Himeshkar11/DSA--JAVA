package assignment_04;

public class q10 {
    // Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void main(String[] args) {
        int number = 12321; // Change this value to test with different numbers
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
