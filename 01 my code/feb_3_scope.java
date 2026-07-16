public class feb_3_scope {
    // method scope 
    // public static void main(String[] args) {
    //     int a = 10;
    //     int b = 20;
    // }
    // static int random(){
    //     System.out.println(a);
    // }
    // public static void main(String[] args) {
    //     System.out.println(nums);
    // }
    // static int numm(){
    //     int nums = 10;
    //     return nums;
    // }
    // example with an argument
    // public static void main(String[] args) {
    //     System.out.println(marks);
    // }
    // static void random(int marks){
    //     marks +=45;
    //     System.out.println(marks);
    // }
    // public static void main(String[] args) {
    //     int a = 10;
    //     int b = 30;
    //     // this ios called creating a block { 
        
    
    // // body }
    // {
    //     // int a = 187; // this will give an error
    //     int c = 15;
    // }
    // // System.out.println(c);
    // block scope or scope of block
    // }
    // public static void main(String[] args) {
    //     int a = 10;
    //     String name = "Himesh";

    //     { 
    //         a=100;
    //         name = "Santhosh";
    //         System.out.println(a);
    //         System.out.println(name);
    //     }
    //     System.out.println(a);
    //     System.out.println(name);

    //     // here in the block we are not creating anew reference variable at aall we are just modifiying the vallues avialbale here thats`it 
    // }
    // shadowing in java 
    // static int x = 20; // what if i create a object here 
    // public static void main(String[] args) {
    //     System.out.println(x);
    //     fn();
    // }
    // static void fn(){
    //     x = x+8;
    //     System.out.println(x);
    // }
//     static int x = 20; // this is called a global variable scope 
//     public static void main(String[] args) {
//         System.out.println(x); // will print global 
//         int x = 40; // this is the local variable scope 
//         System.out.println(x); // will print local varibale scope 
//         fn(); // this will make changes to the global and return it`s value 
//     }
//     static void fn(){
//         x = x+8;
//         System.out.println(x);
//     }
}
