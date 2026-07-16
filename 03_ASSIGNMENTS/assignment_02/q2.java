import java.util.Scanner;

public class q2 {
    // Take name as input and print a greeting message for that particular name.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the program.");
        sc.close();
    }
}
