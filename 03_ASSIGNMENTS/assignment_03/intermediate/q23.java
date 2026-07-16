package assignment_03.intermediate;

// import java.time.Year;

public class q23 {
    // Check Leap Year Or Not
    public static void main(String[] args) {
        int year = 2020; // Change this value to check for a different year

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        System.out.println("Year: " + year);
        if (isLeapYear) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
