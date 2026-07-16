package assignment_03.intermediate;

public class q6 {
    // Calculate Commission Percentage
    public static void main(String[] args) {
        double salesAmount = 15000.0; // Change this value to calculate the commission for a different sales amount
        double commissionPercentage;

        if (salesAmount < 10000) {
            commissionPercentage = 5.0;
        } else if (salesAmount <= 20000) {
            commissionPercentage = 10.0;
        } else {
            commissionPercentage = 15.0;
        }

        double commissionAmount = (commissionPercentage / 100) * salesAmount;
        System.out.println("The sales amount is: $" + salesAmount);
        System.out.println("The commission percentage is: " + commissionPercentage + "%");
        System.out.println("The commission amount is: $" + commissionAmount);
    }
}
