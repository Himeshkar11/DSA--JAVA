package assignment_04;

public class q6 {
    // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
    public static void main(String[] args) {
        double radius = 5.0; // Change this value to test with different radii
        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);
        System.out.println("The circumference of the circle is: " + circumference);
        System.out.println("The area of the circle is: " + area);
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
