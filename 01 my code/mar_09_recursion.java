public class mar_09_recursion {
    public static void main(String[] args) {
        // a recursion is a function that calls itself 
        print(1);

    }
    static void print(int n){
        System.out.println(n);
        if (n == 5) {
            return;
        }
        print(n+1);
    }

}
