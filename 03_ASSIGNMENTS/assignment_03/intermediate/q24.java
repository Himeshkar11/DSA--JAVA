package assignment_03.intermediate;

public class q24 {
    // Sum Of A Digits Of Number
    public static void main(String[] args) {
        int number = 12345; // Change this value to check for a different number
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
