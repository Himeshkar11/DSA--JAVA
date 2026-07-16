package assignment_03.basic;

public class q16 {
    // Volume Of Cylinder
    public static void main(String[] args) {
        double radius = 5.0; // Change this value to calculate the volume for a different radius
        double height = 10.0; // Change this value to calculate the volume for a different height
        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);
    }
}
