package assignment_03.intermediate;

// import java.util.concurrent.Future;

public class q17 {
    // Future Investment Value
    public static void main(String[] args) {
        double principal = 1000.0; // Change this value to set the principal amount
        double annualRate = 5.0; // Change this value to set the annual interest rate (in percentage)
        int years = 10; // Change this value to set the number of years for investment

        double futureValue = principal * Math.pow((1 + annualRate / 100), years);
        System.out.println("The future investment value after " + years + " years is: " + futureValue);
    }


}
