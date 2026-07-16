package assignment_03.intermediate;

public class q18 {
// Armstrong Number In Java

    public static void main(String[] args) {
        int number = 153; // Change this value to check for a different number
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Calculated Sum: " + sum);
        if (originalNumber == sum) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
