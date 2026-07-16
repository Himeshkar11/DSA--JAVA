package assignment_03.intermediate;

public class q19 {
    // HCF Of Two Numbers Program
    public static void main(String[] args) {
        int num1 = 56; // Change this value to test with different numbers
        int num2 = 98; // Change this value to test with different numbers

        int hcf = 1; // Initialize HCF to 1
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i; // Update HCF if i divides both numbers
            }
        }

        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
