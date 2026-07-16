import java.util.Arrays;
import java.util.Scanner;

public class feb_2_methods {

    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // System.out.println( a + " " + b );
        // swap(a,b);
        // System.out.println( a + " " + b );
        // String name = "Himeshkar";
        // ChangeName(name);
        // System.out.println(name);
        // create a array 
        int arr[] = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

        }
    static void change(int nums[]){
        nums[0] = 99; // here we are modifing the string 
    }
    static void ChangeName(String name){
        name = "sonu santosh";
    }
    static void swap(int a,int b){ // no need to retrun na baka 
        int temp = a;
        b= a;
        b = temp;
        
    }
    static String mygreet(String a){
        return "hello" + a;
    }
    static int sum3(int a ,int b){
        int sum = a+b;
        return sum;
    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 here:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 here:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 here:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 here:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is "+ sum);
        sc.close();
    }
    static String greet () {
        String greeting = "Konnichiwa";
        return greeting;
    }
    
    static void display(){
        System.out.println("Hello , World!");
    }
}
