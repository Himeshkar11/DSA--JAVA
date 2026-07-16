package assignment_04;

public class q1 {
    // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

// 
    public static void main(String[] args) {
        int num1 = 10; // Change this value to test with different numbers
        int num2 = 20; // Change this value to test with different numbers
        int num3 = 5;  // Change this value to test with different numbers

        printMax(num1, num2, num3);
        printMin(num1, num2, num3);
    }

    public static void printMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The maximum number is: " + max);
    }

    public static void printMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("The minimum number is: " + min);
    }
}
