package assignment_03.intermediate;

public class q11 {
    // Compound Interest Java Program
    public static void main(String[] args) {
        double principal = 1000.0; // Change this value to set the principal amount
        double rate = 5.0; // Change this value to set the annual interest rate (in percentage)
        int timesCompounded = 4; // Change this value to set the number of times interest is compounded per year
        int years = 10; // Change this value to set the number of years

        double amount = principal * Math.pow((1 + (rate / (100 * timesCompounded))), timesCompounded * years);
        double compoundInterest = amount - principal;

        System.out.println("The compound interest after " + years + " years is: " + compoundInterest);
    }
}
