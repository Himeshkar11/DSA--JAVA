package assignment_03.basic;

public class q25 {
    // Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int number;

        System.out.println("Enter integers to find the largest (enter 0 to stop):");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > largest) {
                largest = number;
            }
        }

        if (largest == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number entered is: " + largest);
        }
        scanner.close();
    }
}
