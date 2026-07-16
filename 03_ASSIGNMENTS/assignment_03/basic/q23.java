package assignment_03.basic;

public class q23 {
    // Input a number and print all the factors of that number (use loops).
    public static void main(String[] args) {
        int number = 28; // Change this value to test with different numbers
        System.out.print("The factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
