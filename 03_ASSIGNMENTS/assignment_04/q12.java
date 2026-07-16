package assignment_04;

public class q12 {
    // Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
    public static void main(String[] args) {
        int a = 3; // Change this value to test with different numbers
        int b = 4; // Change this value to test with different numbers
        int c = 5; // Change this value to test with different numbers
        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println(a + ", " + b + ", and " + c + " form a Pythagorean triplet.");
        } else {
            System.out.println(a + ", " + b + ", and " + c + " do not form a Pythagorean triplet.");
        }
    }
    
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Check if a^2 + b^2 = c^2 (assuming c is the largest number)
        return (a * a + b * b == c * c);
    }
}
