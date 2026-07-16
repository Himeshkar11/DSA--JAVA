package assignment_03.intermediate;

public class q25 {
    // Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
    public static void main(String[] args) {
        int month = 8; // August
        int year = 2023; // Change this value to set the year
        int daysInMonth;

        // Determine the number of days in the month
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month");
                return;
        }

        // Count even days
        int evenDaysCount = 0;
        for (int day = 1; day <= daysInMonth; day++) {
            if (day % 2 == 0) {
                evenDaysCount++;
            }
        }

        System.out.println("Number of days Kunal can go out in August " + year + ": " + evenDaysCount);
    }
}
