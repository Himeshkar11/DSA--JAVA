package assignment_03.intermediate;

public class q13 {
    // Sum Of N Numbers
    public static void main(String[] args) {
        int n = 10; // Change this value to calculate the sum of first n numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }
}
