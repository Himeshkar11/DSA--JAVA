package assignment_03.basic;

public class q7 {
    // Area Of Equilateral Triangle
    public static void main(String[] args) {
        double side = 10.0; // Change this value to calculate the area for a different side length
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("The area of the equilateral triangle with side length " + side + " is: " + area);
    }
}
