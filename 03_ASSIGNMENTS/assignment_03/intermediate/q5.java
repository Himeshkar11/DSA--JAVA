package assignment_03.intermediate;

public class q5 {
    // Calculate Distance Between Two Points
    public static void main(String[] args) {
        double x1 = 3.0; // Change this value to set the x-coordinate of the first point
        double y1 = 4.0; // Change this value to set the y-coordinate of the first point
        double x2 = 7.0; // Change this value to set the x-coordinate of the second point
        double y2 = 1.0; // Change this value to set the y-coordinate of the second point

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);
    }
}
