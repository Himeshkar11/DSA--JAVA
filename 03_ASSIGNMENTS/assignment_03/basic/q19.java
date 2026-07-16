package assignment_03.basic;

public class q19 {
    // Curved Surface Area Of Cylinder
    public static void main(String[] args) {
        double radius = 5.0; // Change this value to calculate the curved surface area for a different radius
        double height = 10.0; // Change this value to calculate the curved surface area for a different height
        double curvedSurfaceArea = 2 * Math.PI * radius * height;
        System.out.println("The curved surface area of the cylinder with radius " + radius + " and height " + height + " is: " + curvedSurfaceArea);
    }
}
