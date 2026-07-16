package assignment_03.basic;

public class q18 {
    // Volume Of Pyramid

    public static void main(String[] args) {
        double baseArea = 20.0; // Change this value to calculate the volume for a different base area
        double height = 10.0; // Change this value to calculate the volume for a different height
        double volume = (1.0 / 3.0) * baseArea * height;
        System.out.println("The volume of the pyramid with base area " + baseArea + " and height " + height + " is: " + volume);
    }
}
