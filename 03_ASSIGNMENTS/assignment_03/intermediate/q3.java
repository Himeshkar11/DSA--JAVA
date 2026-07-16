package assignment_03.intermediate;

public class q3 {
    // Calculate Average Of N Number
    public static void main(String[] args) {
        int n = 5; // Change this value to calculate the average of a different number of elements
        int[] numbers = {10, 20, 30, 40, 50}; // Change these values to test with different numbers
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / n;
        System.out.println("The average of the given " + n + " numbers is: " + average);
    }

}
