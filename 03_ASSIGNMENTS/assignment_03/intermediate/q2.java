package assignment_03.intermediate;

public class q2 {
    // Calculate Electricity Bill
    public static void main(String[] args) {
        int unitsConsumed = 350; // Change this value to test with different units consumed
        double billAmount;

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 1.5) + ((unitsConsumed - 100) * 2.5);
        } else {
            billAmount = (100 * 1.5) + (200 * 2.5) + ((unitsConsumed - 300) * 4.0);
        }

        System.out.println("The electricity bill for " + unitsConsumed + " units is: $" + billAmount);
    }
}
