public class mar_08_recursion_1 {
    public static void main(String[] args) {
    // write a function to print Hello World!
        // message();
        // // printing the message for 5 times 
        // System.out.println("printing the message for 5 times ");
        // for (int i = 0; i < 5; i++) {
        //     message();
        // }
        // calling the message now 
        // message();
        // calling the print fucntion 
        print1(1);
    }

    // static void message(){
    //     System.out.println("Hello World!");
    //     // call message 1 
    //     message1();
    // }
    // static void message1(){
    //     System.out.println("Hello World!");
    //     message2();
    // }
    // static void message2(){
    //     System.out.println("Hello World!");
    //     message3();
    // }
    // static void message3(){
    //     System.out.println("Hello World!");
    //     message4();
    // }
    // static void message4(){
    //     System.out.println("Hello World!");
    // } 
    static void print1(int n){
        System.out.println(n);
        // calling print 2 and passing 2 as argument 
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        // calling print 3 and passing argument 3 
        print3(3);
    } 
    static void print3(int n){
        System.out.println(n);
        // calling print 4 and passign the argument as 4 
        print4(4);
    } 
    static void print4(int n){
        System.out.println(n);
        // calling print 4 and pass ing the argument as 4 
        print5(5);
    } 
    static void print5(int n){
        System.out.println(n);
    } 
           
}
