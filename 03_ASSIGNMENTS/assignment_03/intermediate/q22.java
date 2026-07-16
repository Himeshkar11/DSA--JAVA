package assignment_03.intermediate;

public class q22 {
    // Perfect Number In Java

    public static void main(String[] args) {
        int number = 28; // Change this value to check for a different number
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        System.out.println("Number: " + number);
        System.out.println("Sum of Divisors: " + sum);
        if (sum == number) {
            System.out.println("The number is a perfect number.");
        } else {
            System.out.println("The number is not a perfect number.");
        }
    }

}
