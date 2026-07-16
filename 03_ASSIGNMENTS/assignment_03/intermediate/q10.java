package assignment_03.intermediate;

public class q10 {
    // Calculate CGPA Java Program
    public static void main(String[] args) {
        double[] grades = {8.5, 9.0, 7.5, 8.0, 9.2}; // Change these values to set the grades for different subjects
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        double cgpa = total / grades.length;
        System.out.println("The CGPA is: " + cgpa);
    }
}
