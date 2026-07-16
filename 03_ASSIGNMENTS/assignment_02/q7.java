public class q7 {
    // To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        int n = 10; // Change this value to calculate Fibonacci series up to n numbers
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Series up to " + n + " numbers: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
