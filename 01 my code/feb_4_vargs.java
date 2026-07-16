import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class feb_4_vargs {
    // public static void main(String[] args) {
    //      fun(45,7,8,9,7,94,9,2,0,5,78,9,478);
    // }
    // static void fun(int ...v){
    //     System.out.println(Arrays.toString(v));
    // }
    //     public static void main(String[] args) {
    //     fun();
    // }
    // static void fun(int ...v){
    //     System.out.println(Arrays.toString(v));
    // }
    // public static void main(String[] args) {
    //     fun(2,3,"himesh","kyo","ronin");
    // }
    // static void fun(int a,int b,String ...v){
    //     System.out.println(Arrays.toString(v));
    // }
    // public static void main(String[] args) {
    //     fun(15);
    //     fun("Himesh");
    // }
    // static void fun(int a ){
    //     System.out.println(a);
    // }
    // static void fun(String name ){
    //     System.out.println(name);
    // }
    // for a varargs function 
    // public static void main(String[] args) {
    //     fun(3,4,5,7);
    //     fun("himesh","kyo","ronin","editing");
    // }
    // static void fun(int ...v){
    //     System.out.println("int wala fun");
    //     System.out.println(Arrays.toString(v));
    // }
    // static void fun (String ...n){
    //     System.out.println("String wala fun");
    // System.out.println(Arrays.toString(n));

    // }
    // public static void main(String[] args) {
    //     fun();
    // }
    // static void fun(int ...v){
    //     System.out.println("int wala fun");
    //     System.out.println(Arrays.toString(v));
    // }
    // static void fun (String ...n){
    //     System.out.println("String wala fun");
    //     System.out.println(Arrays.toString(n));

    // }
    // prime number question with methods 
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     boolean ans = isprime(n);
    //     System.out.println(ans);
    // }
    // static boolean isprime(int n ){
    //     if(n<1){
    //         return false;
    //     }
    //     int c=2;
    //     while(c*c<=n){
    //     if(n%c == 0){
    //         return true ;
    //         }
    //         c++;
    //     }
    //     return c*c>n;
 
    // }
// amstrong number 
// for a three digit number the sum of cubes of each digit is the number itself 
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = am_num(n);
        System.out.println(ans);
}
static boolean am_num(int n){
int original = n;
int ans = 0;
while(n>0){
    int rem = n%10;
     n = n/10;
    rem = rem*rem*rem;
    ans =ans +rem;
   
}
return ans==original;
}
}
