package assignment_03.basic;

public class q24 {
    // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter integers to sum them up (enter 0 to stop):");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }

        System.out.println("The sum of all entered numbers is: " + sum);
        scanner.close();
    }
}
