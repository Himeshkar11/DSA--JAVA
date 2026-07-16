package assignment_03.intermediate;

public class q8 {
    // Calculate Depreciation of Value

    public static void main(String[] args) {
        double initialValue = 10000.0; // Change this value to set the initial value of the asset
        double depreciationRate = 15.0; // Change this value to set the annual depreciation rate (in percentage)
        int years = 5; // Change this value to set the number of years for depreciation

        double depreciatedValue = initialValue * Math.pow((1 - depreciationRate / 100), years);
        System.out.println("The depreciated value of the asset after " + years + " years is: " + depreciatedValue);
    }
}
