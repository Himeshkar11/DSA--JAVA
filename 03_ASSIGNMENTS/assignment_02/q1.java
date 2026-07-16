import java.util.*;
public class q1{
    public static void main(String[] args) {
        // Write a program to print whether a number is even or odd, also take input from the user.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if( num %2==0){
            System.out.println("the number "+num+"is even");
        }
        else if (num ==0){
            System.out.println("The number" + num +"is zero ");
        }
        else{
            System.out.println("the number "+ num + "is odd");
        }

    }
}