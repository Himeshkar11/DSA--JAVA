package assignment_03.basic;

public class q14 {
    // Volume Of Cone Java Program
    public static void main(String[] args) {
        double radius = 5.0; // Change this value to calculate the volume for a different radius
        double height = 10.0; // Change this value to calculate the volume for a different height
        double volume = (1.0 / 3.0) * Math.PI * radius * radius * height;
        System.out.println("The volume of the cone with radius " + radius + " and height " + height + " is: " + volume);
    }
}
