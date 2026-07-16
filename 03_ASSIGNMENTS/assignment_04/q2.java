package assignment_04;

public class q2 {
    // Define a program to find out whether a given number is even or odd. using methoods
    public static void main(String[] args) {
        int number = 15; // Change this value to test with different numbers
        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
