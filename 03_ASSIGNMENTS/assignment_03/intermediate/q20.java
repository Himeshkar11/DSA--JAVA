package assignment_03.intermediate;

public class q20 {
    // LCM Of Two Numbers
    public static void main(String[] args) {
        int num1 = 12; // Change this value to test with different numbers
        int num2 = 15; // Change this value to test with different numbers

        int lcm = (num1 > num2) ? num1 : num2; // Start with the larger number
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break; // Found the LCM
            }
            lcm++;
        }

        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
