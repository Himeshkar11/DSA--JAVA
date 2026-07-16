package assignment_04;

public class q3 {
    // A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
    public static void main(String[] args) {
        int age = 20; // Change this value to test with different ages
        if (isEligibleToVote(age)) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
    }
    
    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
