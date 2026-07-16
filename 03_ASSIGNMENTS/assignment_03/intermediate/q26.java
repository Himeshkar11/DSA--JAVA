package assignment_03.intermediate;

public class q26 {
    // Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
    public static void main(String[] args) {
        int[] numbers = { -5, 3, 2, -8, 7, 4, -1, 0 }; // Sample input; replace with user input as needed

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        for (int number : numbers) {
            if (number < 0) {
                sumNegative += number;
            } else if (number > 0) {
                if (number % 2 == 0) {
                    sumPositiveEven += number;
                } else {
                    sumPositiveOdd += number;
                }
            } else {
                break; // Terminate on zero
            }
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }
}
