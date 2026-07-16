package assignment_03.intermediate;

public class q9 {
    // Calculate Batting Average
    public static void main(String[] args) {
        int totalRuns = 250; // Change this value to set the total runs scored by the player
        int totalInnings = 10; // Change this value to set the total innings played by the player
        int notOuts = 2; // Change this value to set the number of times the player was not out

        int timesOut = totalInnings - notOuts;
        double battingAverage = (double) totalRuns / timesOut;
        System.out.println("The batting average of the player is: " + battingAverage);
    }
}
