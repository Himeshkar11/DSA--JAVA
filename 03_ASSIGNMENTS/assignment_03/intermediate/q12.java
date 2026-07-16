package assignment_03.intermediate;

public class q12 {
    // Calculate Average Marks
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88}; // Change these values to set the marks for different subjects
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = (double) total / marks.length;
        System.out.println("The average marks are: " + average);
    }
}
