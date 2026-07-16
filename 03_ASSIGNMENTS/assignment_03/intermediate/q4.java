package assignment_03.intermediate;

public class q4 {
    // Calculate Discount Of Product
    public static void main(String[] args) {
        double originalPrice = 100.0; // Change this value to calculate the discount for a different price
        double discountPercentage = 20.0; // Change this value to calculate the discount for a different percentage
        double discountAmount = (discountPercentage / 100) * originalPrice;
        double finalPrice = originalPrice - discountAmount;
        System.out.println("The original price is: " + originalPrice);
        System.out.println("The discount percentage is: " + discountPercentage + "%");
        System.out.println("The discount amount is: " + discountAmount);
        System.out.println("The final price after discount is: " + finalPrice);
    }
}
